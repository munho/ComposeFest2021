# ComposeFest2021
2021 DevFest ComposeFest 코드랩 Repo 입니다
본 폴더를 Android Studio를 이용해서 열어주세요.
작업을 완료하고, push 해주세요.

# Testing in Jetpack Compose Codelab

This folder contains the source code for the
[Testing in Jetpack Compose Codelab ](https://developer.android.com/codelabs/jetpack-compose-testing)
codelab.

## License
```
Copyright 2021 The Android Open Source Project

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

## rallyAppBarTest_currentLabelExists

2021-11-05 10:26:46.376 31581-31603/com.example.compose.rally D/currentLabelExists: printToLog:
Printing with useUnmergedTree = 'false'
Node #1 at (l=0.0, t=63.0, r=1080.0, b=210.0)px
|-Node #2 at (l=0.0, t=63.0, r=1080.0, b=210.0)px
|-Node #3 at (l=0.0, t=63.0, r=1080.0, b=210.0)px
[SelectableGroup]
|-Node #4 at (l=42.0, t=105.0, r=105.0, b=168.0)px
| Role = 'Tab'
| Selected = 'false'
| ContentDescription = '[Overview]'
| Actions = [OnClick]
| MergeDescendants = 'true'
| ClearAndSetSemantics = 'true'
|-Node #7 at (l=189.0, t=105.0, r=469.0, b=168.0)px
| Role = 'Tab'
| Selected = 'true'
| ContentDescription = '[Accounts]'
| Actions = [OnClick]
| MergeDescendants = 'true'
| ClearAndSetSemantics = 'true'
|-Node #12 at (l=553.0, t=105.0, r=616.0, b=168.0)px
Role = 'Tab'
Selected = 'false'
ContentDescription = '[Bills]'
Actions = [OnClick]
MergeDescendants = 'true'
ClearAndSetSemantics = 'true'

2021-11-05 10:30:07.676 31820-31843/com.example.compose.rally D/currentLabelExists: printToLog:
Printing with useUnmergedTree = 'true'
Node #1 at (l=0.0, t=63.0, r=1080.0, b=210.0)px
|-Node #2 at (l=0.0, t=63.0, r=1080.0, b=210.0)px
|-Node #3 at (l=0.0, t=63.0, r=1080.0, b=210.0)px
[SelectableGroup]
|-Node #4 at (l=42.0, t=105.0, r=105.0, b=168.0)px
| Role = 'Tab'
| Selected = 'false'
| ContentDescription = '[Overview]'
| Actions = [OnClick]
| MergeDescendants = 'true'
| ClearAndSetSemantics = 'true'
|-Node #7 at (l=189.0, t=105.0, r=469.0, b=168.0)px
| Role = 'Tab'
| Selected = 'true'
| ContentDescription = '[Accounts]'
| Actions = [OnClick]
| MergeDescendants = 'true'
| ClearAndSetSemantics = 'true'
|  |-Node #2000000007 at (l=0.0, t=0.0, r=0.0, b=0.0)px
|  | ContentDescription = '[Accounts]'
|  |-Node #10 at (l=284.0, t=105.0, r=469.0, b=154.0)px
|  | Text = '[ACCOUNTS]'
|  | Actions = [GetTextLayoutResult]
|  |-Node #1000000007 at (l=0.0, t=0.0, r=0.0, b=0.0)px
|    Role = 'Tab'
|-Node #12 at (l=553.0, t=105.0, r=616.0, b=168.0)px
Role = 'Tab'
Selected = 'false'
ContentDescription = '[Bills]'
Actions = [OnClick]
MergeDescendants = 'true'
ClearAndSetSemantics = 'true'

2021-11-05 10:36:32.628 32139-32162/com.example.compose.rally D/currentLabelExists: printToLog:
Printing with useUnmergedTree = 'true'
Node #1 at (l=0.0, t=63.0, r=1080.0, b=210.0)px
|-Node #2 at (l=0.0, t=63.0, r=1080.0, b=210.0)px
|-Node #3 at (l=0.0, t=63.0, r=1080.0, b=210.0)px
[SelectableGroup]
|-Node #4 at (l=42.0, t=105.0, r=105.0, b=168.0)px
| Role = 'Tab'
| Selected = 'false'
| ContentDescription = '[Overview]'
| Actions = [OnClick]
| MergeDescendants = 'true'
| ClearAndSetSemantics = 'true'
|-Node #7 at (l=189.0, t=105.0, r=469.0, b=168.0)px
| Role = 'Tab'
| Selected = 'true'
| ContentDescription = '[Accounts]'
| Actions = [OnClick]
| MergeDescendants = 'true'
| ClearAndSetSemantics = 'true'
|  |-Node #2000000007 at (l=0.0, t=0.0, r=0.0, b=0.0)px
|  | ContentDescription = '[Accounts]'
|  |-Node #10 at (l=284.0, t=105.0, r=469.0, b=154.0)px
|  | Text = '[ACCOUNTS]'
|  | Actions = [GetTextLayoutResult]
|  |-Node #1000000007 at (l=0.0, t=0.0, r=0.0, b=0.0)px
|    Role = 'Tab'
|-Node #12 at (l=553.0, t=105.0, r=616.0, b=168.0)px
Role = 'Tab'
Selected = 'false'
ContentDescription = '[Bills]'
Actions = [OnClick]
MergeDescendants = 'true'
ClearAndSetSemantics = 'true'
