# SDUCS Plugin
A Plugin for SDUcraft 文明模拟
Base on Minecraft Spigot API 1.13

## 功能

### 一、旁观模式不可发言（死人闭嘴）

### 二、<font color="red">[Deprecated]</font>使用Scoreboard.Team区分的队伍与全局发言
#### Team: 直接发言
如“芝士雪豹”：[Team.秦始皇] ATRI >> 芝士雪豹
#### All: “@”起手
如“@雪豹闭嘴”：[All] ATRI >> 雪豹闭嘴
> 此功能被弃用，已被置换为第四项功能
> 
> 你可以在 EVENTs.AsyncPlayerChat_Deprecated 中找到已弃用的代码

### 三、禁用命令“/msg”私聊

### 四、发言内容距离可见（当前值为100）
- [Team.秦始皇] ATRI(12.5) >> 芝士雪豹