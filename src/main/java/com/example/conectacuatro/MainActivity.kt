package com.example.conectacuatro

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.example.conectacuatro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        var victoryRed = 0
        var victoryGreen = 0
//        val listBuntton: List<IntRange> =
//            listOf((11..17), (31..37), (41..47), (51..57), (61..67), (71..77))
        var startplay = 0

//        binding.resultRed.text = victoryRed.toString()
//        binding.resultGreen.text = victoryGreen.toString()

        // Iniciar Juego

        binding.red.setOnClickListener {
            startplay++
            if (startplay == 1) {
                stardedButtons()
                buttonsEnable()
                binding.green.isEnabled = false
                binding.table.isVisible = true
            }
        }

        binding.green.setOnClickListener {
            startplay++
            if (startplay == 1) {
                stardedButtons()
                buttonsEnable()
                binding.red.isEnabled = false
                binding.table.isVisible = true
            }
        }

        // Configuracion Rendirse

        binding.buttonSurrenceRed.setOnClickListener {
            victoryRed++
            startplay = 0
            stardedButtons()
            winGreen(victoryRed)
        }

        binding.buttonSurrenceGreen.setOnClickListener {
            victoryGreen++
            startplay = 0
            stardedButtons()
            winRed(victoryGreen)
        }

        // Fila 6

        binding.button71.setOnClickListener {
            if (binding.button71.isEnabled && binding.green.isEnabled) {
                binding.button71.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button71.backgroundTintList = ColorStateList.valueOf(Color.GREEN)


            } else if (binding.button71.isEnabled && binding.red.isEnabled) {
                binding.button71.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button71.backgroundTintList = ColorStateList.valueOf(Color.RED)


            }
        }

        binding.button72.setOnClickListener {
            if (binding.button72.isEnabled && binding.green.isEnabled) {
                binding.button72.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button72.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button72.isEnabled && binding.red.isEnabled) {
                binding.button72.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button72.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button73.setOnClickListener {
            if (binding.button73.isEnabled && binding.green.isEnabled) {
                binding.button73.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button73.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button73.isEnabled && binding.red.isEnabled) {
                binding.button73.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button73.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button74.setOnClickListener {
            if (binding.button74.isEnabled && binding.green.isEnabled) {
                binding.button74.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button74.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button74.isEnabled && binding.red.isEnabled) {
                binding.button74.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button74.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button75.setOnClickListener {
            if (binding.button75.isEnabled && binding.green.isEnabled) {
                binding.button75.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button75.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button75.isEnabled && binding.red.isEnabled) {
                binding.button75.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button75.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button76.setOnClickListener {
            if (binding.button76.isEnabled && binding.green.isEnabled) {
                binding.button76.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button76.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button76.isEnabled && binding.red.isEnabled) {
                binding.button76.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button76.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button77.setOnClickListener {
            if (binding.button77.isEnabled && binding.green.isEnabled) {
                binding.button77.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button77.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button77.isEnabled && binding.red.isEnabled) {
                binding.button77.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button77.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        //Fila 5

        binding.button61.setOnClickListener {
            if (binding.button61.isEnabled && binding.green.isEnabled) {
                binding.button61.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button61.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button61.isEnabled && binding.red.isEnabled) {
                binding.button61.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button61.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button62.setOnClickListener {
            if (binding.button62.isEnabled && binding.green.isEnabled) {
                binding.button62.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button62.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button62.isEnabled && binding.red.isEnabled) {
                binding.button62.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button62.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button63.setOnClickListener {
            if (binding.button63.isEnabled && binding.green.isEnabled) {
                binding.button63.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button63.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button63.isEnabled && binding.red.isEnabled) {
                binding.button63.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button63.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button64.setOnClickListener {
            if (binding.button64.isEnabled && binding.green.isEnabled) {
                binding.button64.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button64.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button64.isEnabled && binding.red.isEnabled) {
                binding.button64.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button64.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button65.setOnClickListener {
            if (binding.button65.isEnabled && binding.green.isEnabled) {
                binding.button65.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button65.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button65.isEnabled && binding.red.isEnabled) {
                binding.button65.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button65.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button66.setOnClickListener {
            if (binding.button66.isEnabled && binding.green.isEnabled) {
                binding.button66.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button66.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button66.isEnabled && binding.red.isEnabled) {
                binding.button66.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button66.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button67.setOnClickListener {
            if (binding.button67.isEnabled && binding.green.isEnabled) {
                binding.button67.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button67.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button77.isEnabled && binding.red.isEnabled) {
                binding.button67.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button67.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        // fila 4

        binding.button51.setOnClickListener {
            if (binding.button51.isEnabled && binding.green.isEnabled) {
                binding.button51.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button51.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button51.isEnabled && binding.red.isEnabled) {
                binding.button51.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button51.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button52.setOnClickListener {
            if (binding.button52.isEnabled && binding.green.isEnabled) {
                binding.button52.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button52.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button52.isEnabled && binding.red.isEnabled) {
                binding.button52.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button52.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button53.setOnClickListener {
            if (binding.button53.isEnabled && binding.green.isEnabled) {
                binding.button53.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button53.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button53.isEnabled && binding.red.isEnabled) {
                binding.button53.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button53.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button54.setOnClickListener {
            if (binding.button54.isEnabled && binding.green.isEnabled) {
                binding.button54.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button54.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button54.isEnabled && binding.red.isEnabled) {
                binding.button54.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button54.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button55.setOnClickListener {
            if (binding.button55.isEnabled && binding.green.isEnabled) {
                binding.button55.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button55.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button55.isEnabled && binding.red.isEnabled) {
                binding.button55.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button55.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button56.setOnClickListener {
            if (binding.button56.isEnabled && binding.green.isEnabled) {
                binding.button56.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button56.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button55.isEnabled && binding.red.isEnabled) {
                binding.button56.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button56.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button57.setOnClickListener {
            if (binding.button57.isEnabled && binding.green.isEnabled) {
                binding.button57.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button57.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button77.isEnabled && binding.red.isEnabled) {
                binding.button57.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button57.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        // fila 3

        binding.button41.setOnClickListener {
            if (binding.button41.isEnabled && binding.green.isEnabled) {
                binding.button41.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button41.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button41.isEnabled && binding.red.isEnabled) {
                binding.button41.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button41.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button42.setOnClickListener {
            if (binding.button42.isEnabled && binding.green.isEnabled) {
                binding.button42.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button42.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button42.isEnabled && binding.red.isEnabled) {
                binding.button42.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button42.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button43.setOnClickListener {
            if (binding.button43.isEnabled && binding.green.isEnabled) {
                binding.button43.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button43.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button43.isEnabled && binding.red.isEnabled) {
                binding.button43.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button43.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button44.setOnClickListener {
            if (binding.button44.isEnabled && binding.green.isEnabled) {
                binding.button44.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button44.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button44.isEnabled && binding.red.isEnabled) {
                binding.button44.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button44.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button45.setOnClickListener {
            if (binding.button45.isEnabled && binding.green.isEnabled) {
                binding.button45.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button45.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button55.isEnabled && binding.red.isEnabled) {
                binding.button45.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button45.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button46.setOnClickListener {
            if (binding.button46.isEnabled && binding.green.isEnabled) {
                binding.button46.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button46.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button44.isEnabled && binding.red.isEnabled) {
                binding.button46.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button46.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button47.setOnClickListener {
            if (binding.button47.isEnabled && binding.green.isEnabled) {
                binding.button47.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button47.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button77.isEnabled && binding.red.isEnabled) {
                binding.button47.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button47.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        // fila 2

        binding.button31.setOnClickListener {
            if (binding.button31.isEnabled && binding.green.isEnabled) {
                binding.button31.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button31.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button31.isEnabled && binding.red.isEnabled) {
                binding.button31.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button31.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button32.setOnClickListener {
            if (binding.button32.isEnabled && binding.green.isEnabled) {
                binding.button32.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button32.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button32.isEnabled && binding.red.isEnabled) {
                binding.button32.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button32.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button33.setOnClickListener {
            if (binding.button33.isEnabled && binding.green.isEnabled) {
                binding.button33.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button33.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button33.isEnabled && binding.red.isEnabled) {
                binding.button33.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button33.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button34.setOnClickListener {
            if (binding.button34.isEnabled && binding.green.isEnabled) {
                binding.button34.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button34.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button33.isEnabled && binding.red.isEnabled) {
                binding.button34.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button34.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button35.setOnClickListener {
            if (binding.button35.isEnabled && binding.green.isEnabled) {
                binding.button35.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button35.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button55.isEnabled && binding.red.isEnabled) {
                binding.button35.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button35.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button36.setOnClickListener {
            if (binding.button36.isEnabled && binding.green.isEnabled) {
                binding.button36.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button36.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button33.isEnabled && binding.red.isEnabled) {
                binding.button36.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button36.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button37.setOnClickListener {
            if (binding.button37.isEnabled && binding.green.isEnabled) {
                binding.button37.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button37.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button77.isEnabled && binding.red.isEnabled) {
                binding.button37.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button37.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        // fila 1

        binding.button11.setOnClickListener {
            if (binding.button11.isEnabled && binding.green.isEnabled) {
                binding.button11.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button11.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button11.isEnabled && binding.red.isEnabled) {
                binding.button11.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button11.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button12.setOnClickListener {
            if (binding.button12.isEnabled && binding.green.isEnabled) {
                binding.button12.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button12.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button12.isEnabled && binding.red.isEnabled) {
                binding.button12.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button12.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button13.setOnClickListener {
            if (binding.button13.isEnabled && binding.green.isEnabled) {
                binding.button13.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button13.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button13.isEnabled && binding.red.isEnabled) {
                binding.button13.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button13.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button14.setOnClickListener {
            if (binding.button14.isEnabled && binding.green.isEnabled) {
                binding.button14.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button14.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button11.isEnabled && binding.red.isEnabled) {
                binding.button14.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button14.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button15.setOnClickListener {
            if (binding.button15.isEnabled && binding.green.isEnabled) {
                binding.button15.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button15.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button55.isEnabled && binding.red.isEnabled) {
                binding.button15.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button15.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button16.setOnClickListener {
            if (binding.button16.isEnabled && binding.green.isEnabled) {
                binding.button16.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button16.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button11.isEnabled && binding.red.isEnabled) {
                binding.button16.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button16.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }

        binding.button17.setOnClickListener {
            if (binding.button17.isEnabled && binding.green.isEnabled) {
                binding.button17.isEnabled = false
                binding.green.isEnabled = false
                binding.red.isEnabled = true
                binding.button17.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            } else if (binding.button77.isEnabled && binding.red.isEnabled) {
                binding.button17.isEnabled = false
                binding.green.isEnabled = true
                binding.red.isEnabled = false
                binding.button17.backgroundTintList = ColorStateList.valueOf(Color.RED)
            }
        }


    }

    private fun evaluation71T(send: CharSequence?) {

        var puente = send.toString().toInt()

        if (binding.button72.backgroundTintList == ColorStateList.valueOf(Color.GREEN) &&
            binding.button73.backgroundTintList == ColorStateList.valueOf(Color.GREEN) &&
            binding.button74.backgroundTintList == ColorStateList.valueOf(Color.GREEN)
        ) {
            winGreen(puente)

        } else if (
            binding.button62.backgroundTintList == ColorStateList.valueOf(Color.GREEN) &&
            binding.button53.backgroundTintList == ColorStateList.valueOf(Color.GREEN) &&
            binding.button44.backgroundTintList == ColorStateList.valueOf(Color.GREEN)
        ) {
            winGreen(puente)

        } else if (
            binding.button61.backgroundTintList == ColorStateList.valueOf(Color.GREEN) &&
            binding.button51.backgroundTintList == ColorStateList.valueOf(Color.GREEN) &&
            binding.button41.backgroundTintList == ColorStateList.valueOf(Color.GREEN)
        ) {
            winGreen(puente)
        }

    }


    fun buttonsDisabled() {

        /*   _listBuntton.forEach{rango->
               rango.forEach{indv->
                   binding.button(indv).isEnabled = false  */

        binding.button11.isEnabled = false
        binding.button12.isEnabled = false
        binding.button13.isEnabled = false
        binding.button14.isEnabled = false
        binding.button15.isEnabled = false
        binding.button16.isEnabled = false
        binding.button17.isEnabled = false
        binding.button31.isEnabled = false
        binding.button32.isEnabled = false
        binding.button33.isEnabled = false
        binding.button34.isEnabled = false
        binding.button35.isEnabled = false
        binding.button36.isEnabled = false
        binding.button37.isEnabled = false
        binding.button41.isEnabled = false
        binding.button42.isEnabled = false
        binding.button43.isEnabled = false
        binding.button44.isEnabled = false
        binding.button45.isEnabled = false
        binding.button46.isEnabled = false
        binding.button47.isEnabled = false
        binding.button51.isEnabled = false
        binding.button52.isEnabled = false
        binding.button53.isEnabled = false
        binding.button54.isEnabled = false
        binding.button55.isEnabled = false
        binding.button56.isEnabled = false
        binding.button57.isEnabled = false
        binding.button61.isEnabled = false
        binding.button62.isEnabled = false
        binding.button63.isEnabled = false
        binding.button64.isEnabled = false
        binding.button65.isEnabled = false
        binding.button66.isEnabled = false
        binding.button67.isEnabled = false
        binding.button71.isEnabled = false
        binding.button72.isEnabled = false
        binding.button73.isEnabled = false
        binding.button74.isEnabled = false
        binding.button75.isEnabled = false
        binding.button76.isEnabled = false
        binding.button77.isEnabled = false
        binding.winGreen.text = ""
        binding.winRed.text = ""

    }

    fun buttonsEnable() {

        binding.button11.isEnabled = true
        binding.button12.isEnabled = true
        binding.button13.isEnabled = true
        binding.button14.isEnabled = true
        binding.button15.isEnabled = true
        binding.button16.isEnabled = true
        binding.button17.isEnabled = true
        binding.button31.isEnabled = true
        binding.button32.isEnabled = true
        binding.button33.isEnabled = true
        binding.button34.isEnabled = true
        binding.button35.isEnabled = true
        binding.button36.isEnabled = true
        binding.button37.isEnabled = true
        binding.button41.isEnabled = true
        binding.button42.isEnabled = true
        binding.button43.isEnabled = true
        binding.button44.isEnabled = true
        binding.button45.isEnabled = true
        binding.button46.isEnabled = true
        binding.button47.isEnabled = true
        binding.button51.isEnabled = true
        binding.button52.isEnabled = true
        binding.button53.isEnabled = true
        binding.button54.isEnabled = true
        binding.button55.isEnabled = true
        binding.button56.isEnabled = true
        binding.button57.isEnabled = true
        binding.button61.isEnabled = true
        binding.button62.isEnabled = true
        binding.button63.isEnabled = true
        binding.button64.isEnabled = true
        binding.button65.isEnabled = true
        binding.button66.isEnabled = true
        binding.button67.isEnabled = true
        binding.button71.isEnabled = true
        binding.button72.isEnabled = true
        binding.button73.isEnabled = true
        binding.button74.isEnabled = true
        binding.button75.isEnabled = true
        binding.button76.isEnabled = true
        binding.button77.isEnabled = true
        binding.winGreen.text = ""
        binding.winRed.text = ""

    }

    fun stardedButtons() {

        binding.button11.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button12.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button13.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button14.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button15.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button16.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button17.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button31.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button32.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button33.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button34.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button35.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button36.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button37.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button41.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button42.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button43.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button44.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button45.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button46.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button47.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button51.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button52.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button53.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button54.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button55.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button56.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button57.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button61.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button62.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button63.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button64.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button65.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button66.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button67.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button71.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button72.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button73.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button74.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button75.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button76.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.button77.backgroundTintList = ColorStateList.valueOf(Color.GRAY)
        binding.winGreen.text = ""
        binding.winRed.text = ""
        binding.buttonSurrenceGreen.isEnabled = true
        binding.buttonSurrenceRed.isEnabled = true

    }

    fun winGreen(_result: Int) {
        buttonsDisabled()
        binding.red.isEnabled = true
        binding.green.isEnabled = false
        binding.winGreen.text = "GANADOR"
        binding.resultGreen.text = _result.toString()
        binding.buttonSurrenceGreen.isEnabled = false
        binding.buttonSurrenceRed.isEnabled = false

    }

    fun winRed(_result: Int) {
        buttonsDisabled()
        binding.red.isEnabled = false
        binding.green.isEnabled = true
        binding.winRed.text = "GANADOR"
        binding.resultRed.text = _result.toString()
        binding.buttonSurrenceGreen.isEnabled = false
        binding.buttonSurrenceRed.isEnabled = false
    }

    fun evaluation71(_result: Int) {

        var puente = _result

        if (binding.button72.backgroundTintList == ColorStateList.valueOf(Color.GREEN) &&
            binding.button73.backgroundTintList == ColorStateList.valueOf(Color.GREEN) &&
            binding.button74.backgroundTintList == ColorStateList.valueOf(Color.GREEN)
        ) {
            winGreen(puente)

        } else if (
            binding.button62.backgroundTintList == ColorStateList.valueOf(Color.GREEN) &&
            binding.button53.backgroundTintList == ColorStateList.valueOf(Color.GREEN) &&
            binding.button44.backgroundTintList == ColorStateList.valueOf(Color.GREEN)
        ) {
            winGreen(puente)

        } else if (
            binding.button61.backgroundTintList == ColorStateList.valueOf(Color.GREEN) &&
            binding.button51.backgroundTintList == ColorStateList.valueOf(Color.GREEN) &&
            binding.button41.backgroundTintList == ColorStateList.valueOf(Color.GREEN)
        ) {
            winGreen(puente)
        }

//        else if (
//            binding.button72.backgroundTintList == ColorStateList.valueOf(Color.RED) &&
//            binding.button73.backgroundTintList == ColorStateList.valueOf(Color.RED) &&
//            binding.button74.backgroundTintList == ColorStateList.valueOf(Color.RED)
//        ) {
//            winRed(_result)
//
//        } else if (
//            binding.button62.backgroundTintList == ColorStateList.valueOf(Color.RED) &&
//            binding.button53.backgroundTintList == ColorStateList.valueOf(Color.RED) &&
//            binding.button44.backgroundTintList == ColorStateList.valueOf(Color.RED)
//        ) {
//            winRed(_result)
//
//        } else if (
//            binding.button61.backgroundTintList == ColorStateList.valueOf(Color.RED) &&
//            binding.button51.backgroundTintList == ColorStateList.valueOf(Color.RED) &&
//            binding.button41.backgroundTintList == ColorStateList.valueOf(Color.RED)
//        ) {
//            winRed(_result)
//        }
    }
}



