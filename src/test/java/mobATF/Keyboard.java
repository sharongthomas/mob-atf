package mobATF;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Keyboard {

    private AndroidDriver<WebElement> driver;

    public Keyboard(AndroidDriver<WebElement> driver) {
        this.driver = driver;
    }

    public void type(CharSequence characters) {
        int length = characters.length();
        for (int i = 0; i < length; i++) {
            char character = characters.charAt(i);
            type(character);
        }
    }
    
    public void doType(int code)  {
    	this.driver.pressKeyCode(code);
    }
    
    public void doType(int modifier, int code)  {
    	this.driver.pressKeyCode(code, modifier);
    }
    
    public void type(char character) {
        switch (character) {
        case 'a': doType(AndroidKeyCode.KEYCODE_A); break;
        case 'b': doType(AndroidKeyCode.KEYCODE_B); break;
        case 'c': doType(AndroidKeyCode.KEYCODE_C); break;
        case 'd': doType(AndroidKeyCode.KEYCODE_D); break;
        case 'e': doType(AndroidKeyCode.KEYCODE_E); break;
        case 'f': doType(AndroidKeyCode.KEYCODE_F); break;
        case 'g': doType(AndroidKeyCode.KEYCODE_G); break;
        case 'h': doType(AndroidKeyCode.KEYCODE_H); break;
        case 'i': doType(AndroidKeyCode.KEYCODE_I); break;
        case 'j': doType(AndroidKeyCode.KEYCODE_J); break;
        case 'k': doType(AndroidKeyCode.KEYCODE_K); break;
        case 'l': doType(AndroidKeyCode.KEYCODE_L); break;
        case 'm': doType(AndroidKeyCode.KEYCODE_M); break;
        case 'n': doType(AndroidKeyCode.KEYCODE_N); break;
        case 'o': doType(AndroidKeyCode.KEYCODE_O); break;
        case 'p': doType(AndroidKeyCode.KEYCODE_P); break;
        case 'q': doType(AndroidKeyCode.KEYCODE_Q); break;
        case 'r': doType(AndroidKeyCode.KEYCODE_R); break;
        case 's': doType(AndroidKeyCode.KEYCODE_S); break;
        case 't': doType(AndroidKeyCode.KEYCODE_T); break;
        case 'u': doType(AndroidKeyCode.KEYCODE_U); break;
        case 'v': doType(AndroidKeyCode.KEYCODE_V); break;
        case 'w': doType(AndroidKeyCode.KEYCODE_W); break;
        case 'x': doType(AndroidKeyCode.KEYCODE_X); break;
        case 'y': doType(AndroidKeyCode.KEYCODE_Y); break;
        case 'z': doType(AndroidKeyCode.KEYCODE_Z); break;
        case 'A': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_A); break;
        case 'B': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_B); break;
        case 'C': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_C); break;
        case 'D': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_D); break;
        case 'E': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_E); break;
        case 'F': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_F); break;
        case 'G': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_G); break;
        case 'H': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_H); break;
        case 'I': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_I); break;
        case 'J': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_J); break;
        case 'K': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_K); break;
        case 'L': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_L); break;
        case 'M': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_M); break;
        case 'N': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_N); break;
        case 'O': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_O); break;
        case 'P': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_P); break;
        case 'Q': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_Q); break;
        case 'R': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_R); break;
        case 'S': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_S); break;
        case 'T': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_T); break;
        case 'U': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_U); break;
        case 'V': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_V); break;
        case 'W': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_W); break;
        case 'X': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_X); break;
        case 'Y': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_Y); break;
        case 'Z': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_Z); break;
        case '`': doType(AndroidKeyCode.KEYCODE_APOSTROPHE); break;
        case '0': doType(AndroidKeyCode.KEYCODE_0); break;
        case '1': doType(AndroidKeyCode.KEYCODE_1); break;
        case '2': doType(AndroidKeyCode.KEYCODE_2); break;
        case '3': doType(AndroidKeyCode.KEYCODE_3); break;
        case '4': doType(AndroidKeyCode.KEYCODE_4); break;
        case '5': doType(AndroidKeyCode.KEYCODE_5); break;
        case '6': doType(AndroidKeyCode.KEYCODE_6); break;
        case '7': doType(AndroidKeyCode.KEYCODE_7); break;
        case '8': doType(AndroidKeyCode.KEYCODE_8); break;
        case '9': doType(AndroidKeyCode.KEYCODE_9); break;
        case '-': doType(AndroidKeyCode.KEYCODE_MINUS); break;
        case '=': doType(AndroidKeyCode.KEYCODE_EQUALS); break;
        case '~': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_APOSTROPHE); break;
        case '!': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_1); break;
        case '@': doType(AndroidKeyCode.KEYCODE_AT); break;
        case '#': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_3); break;
        case '$': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_4); break;
        case '%': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_5); break;
        case '^': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_6); break;
        case '&': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_7); break;
        case '*': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_8); break;
        case '(': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_9); break;
        case ')': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_0); break;
        case '_': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_MINUS); break;
        case '+': doType(AndroidKeyCode.KEYCODE_PLUS); break;
        case '\t': doType(AndroidKeyCode.KEYCODE_TAB); break;
        case '\n': doType(AndroidKeyCode.KEYCODE_ENTER); break;
        case '.': doType(AndroidKeyCode.KEYCODE_PERIOD); break;
        case ' ': doType(AndroidKeyCode.KEYCODE_SPACE); break;
/*      case '[': doType(AndroidKeyCode.KEYCODE_OPEN_BRACKET); break;
        case ']': doType(AndroidKeyCode.KEYCODE_CLOSE_BRACKET); break;
        case '\\': doType(AndroidKeyCode.KEYCODE_BACK_SLASH); break;
        case '{': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_OPEN_BRACKET); break;
        case '}': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_CLOSE_BRACKET); break;
        case '|': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_BACK_SLASH); break;
        case ';': doType(AndroidKeyCode.KEYCODE_SEMICOLON); break;
        case ':': doType(AndroidKeyCode.KEYCODE_COLON); break;
        case '\'': doType(AndroidKeyCode.KEYCODE_QUOTE); break;
        case '"': doType(AndroidKeyCode.KEYCODE_QUOTEDBL); break;
        case ',': doType(AndroidKeyCode.KEYCODE_COMMA); break;
        case '<': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_COMMA); break;
        case '>': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_PERIOD); break;
        case '/': doType(AndroidKeyCode.KEYCODE_SLASH); break;
        case '?': doType(AndroidKeyCode.META_SHIFT_ON, AndroidKeyCode.KEYCODE_SLASH); break;*/

        default:
            throw new IllegalArgumentException("Cannot type character " + character);
        }
    }
}

