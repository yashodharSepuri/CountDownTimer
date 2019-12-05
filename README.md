# CountDownTimer
Easiest way to show count down of time on Android. CountDownTimer Library offers lots of Customisation options.

## Usage
Include CountDownTimer in your layout :

```xml

<com.yashdev.countdowntimer.CountDownTimerView
    android:id="@+id/countDownTimerView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>

```

And Initialize the CountDownTimer :

```java

CountDownTimerView countDownTimerView = findViewById(R.id.countDownTimerView);
countDownTimerView.setTime(7200000); // In Milliseconds

// To Start the Count Down
countDownTimerView.startCountDown();

// To Stop the Count Down
countDownTimerView.stopCountDown();

// CountDownTimer Listener
countDownTimerView.setOnTimerListener(new CountDownTimerView.TimerListener() {
    @Override
    public void onTick(long millisUntilFinished) {
        //on Tick
    }
                                                                              
    @Override
    public void onFinish() {
        // on Finish
        Toast.makeText(getApplicationContext(),"Times up !",Toast.LENGTH_LONG).show();
    }
});

```

## Example

For an example, please check the MainActivity class in the provided Sample App.

## License
```
MIT License

Copyright (c) 2019 yashDev

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
