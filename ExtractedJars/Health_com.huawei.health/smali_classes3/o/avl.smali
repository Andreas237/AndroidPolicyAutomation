.class public Lo/avl;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lorg/json/JSONObject;Ljava/lang/String;)Lo/avm;
    .locals 2

    .line 37
    const/4 v1, 0x0

    .line 38
    const-string v0, "FriendInvatationNotify"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_0

    .line 43
    :cond_0
    const-string v0, "GroupInvatationNotify"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 45
    new-instance v1, Lo/avq;

    invoke-direct {v1, p1}, Lo/avq;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 47
    :cond_1
    const-string v0, "FriendListChangeNotify"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 52
    :cond_2
    const-string v0, "GroupListChangeNotify"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 54
    new-instance v1, Lo/avo;

    invoke-direct {v1, p1}, Lo/avo;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 56
    :cond_3
    const-string v0, "GroupInfoChangeNotify"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 58
    new-instance v1, Lo/avi;

    invoke-direct {v1, p1}, Lo/avi;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 60
    :cond_4
    const-string v0, "GroupMemListChangeNotify"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 62
    new-instance v1, Lo/avn;

    invoke-direct {v1, p1}, Lo/avn;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 64
    :cond_5
    const-string v0, "MessageNotify"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_0

    .line 69
    :cond_6
    const-string v0, "ImOfflineNotify"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_0

    .line 74
    :cond_7
    const-string v0, "UserInfoChangeNotify"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 76
    new-instance v1, Lo/avt;

    invoke-direct {v1, p1}, Lo/avt;-><init>(Ljava/lang/String;)V

    .line 78
    :cond_8
    :goto_0
    return-object v1
.end method
