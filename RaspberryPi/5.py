# Imports
from machine import Pin, PWM
import time

# Set up the Buzzer pin as PWM
buzzer = PWM(Pin(13)) # Set the buzzer to PWM mode

# Create our library of tone variables for "Jingle Bells"
C = 523
D = 587
E = 659
F = 698
G = 784

# Create volume variable (Duty cycle)
volume = 32768

red = Pin(18, Pin.OUT)
amber = Pin(19, Pin.OUT)
green = Pin(20, Pin.OUT)

# Create our function with arguments
def playtone(note,vol,delay1,delay2):
    buzzer.duty_u16(vol)
    buzzer.freq(note)
    time.sleep(delay1)
    buzzer.duty_u16(0)
    time.sleep(delay2)
    
def lightswitch(light):
    red.value(0) # ON
    amber.value(0) # OFF
    green.value(0) # OFF
    
    light.value(1)
    

    
# Play the tune
red.value(0) # ON
amber.value(0) # OFF
green.value(0) # OFF
playtone(E,volume,0.1,0.2)
lightswitch(red)
playtone(E,volume,0.1,0.2)
lightswitch(amber)
playtone(E,volume,0.1,0.5) #Longer second delay
lightswitch(green)
playtone(E,volume,0.1,0.2)
lightswitch(red)
playtone(E,volume,0.1,0.2)
lightswitch(amber)
playtone(E,volume,0.1,0.5) #Longer second delay
lightswitch(green)

playtone(E,volume,0.1,0.2)
lightswitch(red)
playtone(G,volume,0.1,0.2)
lightswitch(green)
playtone(C,volume,0.1,0.2)
lightswitch(red)
playtone(D,volume,0.1,0.2)
lightswitch(amber)
playtone(E,volume,0.1,0.5)
lightswitch(green)

playtone(F,volume,0.1,0.2)
lightswitch(red)
playtone(F,volume,0.1,0.2)
lightswitch(amber)
playtone(F,volume,0.1,0.2)
lightswitch(green)
playtone(F,volume,0.1,0.2)
lightswitch(amber)
playtone(F,volume,0.1,0.2)
lightswitch(red)


playtone(E,volume,0.1,0.2)
lightswitch(amber)
playtone(E,volume,0.1,0.2)
lightswitch(green)
playtone(E,volume,0.1,0.2)
lightswitch(amber)
playtone(E,volume,0.1,0.2)
lightswitch(green)

playtone(D,volume,0.1,0.2)
lightswitch(amber)
playtone(D,volume,0.1,0.2)
lightswitch(amber)
playtone(E,volume,0.1,0.2)
lightswitch(green)
playtone(D,volume,0.1,0.5)
lightswitch(amber)
playtone(G,volume,0.1,0.8)
lightswitch(green)

playtone(E,volume,0.1,0.2)
lightswitch(red)
playtone(E,volume,0.1,0.2)
lightswitch(amber)
playtone(E,volume,0.1,0.5) #Longer second delay
lightswitch(green)
playtone(E,volume,0.1,0.2)
lightswitch(red)
playtone(E,volume,0.1,0.2)
lightswitch(amber)
playtone(E,volume,0.1,0.5) #Longer second delay
lightswitch(green)

playtone(E,volume,0.1,0.2)
lightswitch(red)
playtone(G,volume,0.1,0.2)
lightswitch(green)
playtone(C,volume,0.1,0.2)
lightswitch(red)
playtone(D,volume,0.1,0.2)
lightswitch(amber)
playtone(E,volume,0.1,0.5)
lightswitch(green)

playtone(F,volume,0.1,0.2)
lightswitch(red)
playtone(F,volume,0.1,0.2)
lightswitch(amber)
playtone(F,volume,0.1,0.2)
lightswitch(green)
playtone(F,volume,0.1,0.2)
lightswitch(amber)
playtone(F,volume,0.1,0.2)
lightswitch(red)


playtone(E,volume,0.1,0.2)
lightswitch(amber)
playtone(E,volume,0.1,0.2)
lightswitch(green)
playtone(E,volume,0.1,0.2)
lightswitch(amber)

playtone(G,volume,0.1,0.3)
lightswitch(green)
playtone(G,volume,0.1,0.3)
lightswitch(green)
playtone(F,volume,0.1,0.3)
lightswitch(amber)
playtone(D,volume,0.1,0.3)
lightswitch(red)
playtone(C,volume,0.1,0.8)
lightswitch(red)
red.value(1) # ON
amber.value(1) # OFF
green.value(1) # OFF

# Duty to 0 to turn the buzzer off
buzzer.duty_u16(0)
