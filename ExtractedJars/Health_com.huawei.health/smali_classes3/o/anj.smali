.class public Lo/anj;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 3

    .line 12
    const/4 v2, 0x0

    .line 13
    const-string v0, "com.huawei.intelligent"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "3dc48303b51039c862bbbaff279d47bfdd44a3af7919356dbe212fdd3f1c884b"

    .line 14
    invoke-static {p0, p1}, Lo/anf;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05"

    .line 15
    invoke-static {p0, p1}, Lo/anf;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "1e3eee2a88a6df75fb4af56adc8373bb818f3cb90a4935c7821582b8cebb694c"

    .line 16
    invoke-static {p0, p1}, Lo/anf;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 18
    :cond_0
    const/4 v2, 0x1

    goto/16 :goto_0

    .line 19
    :cond_1
    const-string v0, "com.huawei.bone"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "9dc745a5f9f60b611ab03a19166ee505834026f4f4a971aa704094f2a2c0072d"

    .line 20
    invoke-static {p0, p1}, Lo/anf;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 21
    const/4 v2, 0x1

    goto/16 :goto_0

    .line 22
    :cond_2
    const-string v0, "com.huawei.camera"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "fac41ea711512ad971465bacb63d269cd2fc90c7ff5c37d043d3fdd89a9e6009"

    .line 23
    invoke-static {p0, p1}, Lo/anf;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "4e8442c0a958e311edb4c08f3c2fd5654a274aa31ae07fdaed6baea739c8e639"

    .line 24
    invoke-static {p0, p1}, Lo/anf;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 25
    :cond_3
    const/4 v2, 0x1

    goto/16 :goto_0

    .line 26
    :cond_4
    const-string v0, "com.android.gallery3d"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "3dc48303b51039c862bbbaff279d47bfdd44a3af7919356dbe212fdd3f1c884b"

    .line 27
    invoke-static {p0, p1}, Lo/anf;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "50787dff857ccc7423352c5273275ad14b21f2b977ca3c124cf4684c1a9bc05c"

    .line 28
    invoke-static {p0, p1}, Lo/anf;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 29
    :cond_5
    const/4 v2, 0x1

    goto :goto_0

    .line 30
    :cond_6
    const-string v0, "com.android.keyguard"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05"

    .line 31
    invoke-static {p0, p1}, Lo/anf;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 32
    const/4 v2, 0x1

    goto :goto_0

    .line 33
    :cond_7
    const-string v0, "com.android.systemui"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05"

    .line 34
    invoke-static {p0, p1}, Lo/anf;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 35
    const/4 v2, 0x1

    goto :goto_0

    .line 36
    :cond_8
    const-string v0, "com.huawei.android.launcher"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "1e3eee2a88a6df75fb4af56adc8373bb818f3cb90a4935c7821582b8cebb694c"

    .line 37
    invoke-static {p0, p1}, Lo/anf;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 38
    const/4 v2, 0x1

    goto :goto_0

    .line 39
    :cond_9
    const-string v0, "com.huawei.hiboard"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05"

    .line 40
    invoke-static {p0, p1}, Lo/anf;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 41
    const/4 v2, 0x1

    .line 43
    :cond_a
    :goto_0
    return v2
.end method
