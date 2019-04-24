.class public Lo/exi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/exi$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Activity;Lo/exi$b;)V
    .locals 8

    .line 23
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fiy;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 25
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    const-string v0, "activityName"

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    const-string v0, "Step"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Calorie"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Distance"

    .line 30
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Climb"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 31
    :cond_0
    sget-object v0, Lo/exi$3;->d:[I

    invoke-virtual {p1}, Lo/exi$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 33
    :pswitch_0
    sget-object v0, Lo/dae;->gA:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 34
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v4, v2, v1}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 35
    goto :goto_1

    .line 37
    :pswitch_1
    sget-object v0, Lo/dae;->gD:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 38
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v5, v2, v1}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 39
    goto :goto_1

    .line 41
    :pswitch_2
    sget-object v0, Lo/dae;->gC:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 42
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v6, v2, v1}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 43
    goto :goto_1

    .line 45
    :pswitch_3
    sget-object v0, Lo/dae;->gB:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v7

    .line 46
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v7, v2, v1}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 47
    goto :goto_1

    .line 49
    :goto_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "UnKnownBI Point"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 52
    :cond_1
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
