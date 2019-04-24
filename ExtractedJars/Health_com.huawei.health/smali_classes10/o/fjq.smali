.class public Lo/fjq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Landroid/app/Activity;Ljava/lang/String;)Lo/fjp;
    .locals 4

    .line 23
    new-instance v1, Lo/fm;

    invoke-direct {v1, p0}, Lo/fm;-><init>(Landroid/app/Activity;)V

    .line 24
    const/4 v0, 0x1

    invoke-virtual {v1, p1, v0}, Lo/fm;->a(Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object v2

    .line 25
    new-instance v3, Lo/fjp;

    const/4 v0, 0x1

    invoke-direct {v3, v2, v0}, Lo/fjp;-><init>(Ljava/util/Map;Z)V

    .line 26
    return-object v3
.end method
