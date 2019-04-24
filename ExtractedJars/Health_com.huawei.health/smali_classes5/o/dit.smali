.class public Lo/dit;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dir;


# static fields
.field private static d:Lo/dit;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    return-void
.end method

.method public static d()Lo/dit;
    .locals 2

    .line 24
    sget-object v0, Lo/dit;->d:Lo/dit;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 26
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 27
    invoke-static {}, Lo/diw;->a()Lo/diw;

    move-result-object v0

    sput-object v0, Lo/dit;->d:Lo/dit;

    goto :goto_0

    .line 29
    :cond_0
    invoke-static {}, Lo/dja;->a()Lo/dja;

    move-result-object v0

    sput-object v0, Lo/dit;->d:Lo/dit;

    .line 32
    :cond_1
    :goto_0
    sget-object v0, Lo/dit;->d:Lo/dit;

    return-object v0
.end method


# virtual methods
.method public b()Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;
    .locals 1

    .line 37
    const/4 v0, 0x0

    return-object v0
.end method

.method public c()V
    .locals 0

    .line 58
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 48
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 43
    return-void
.end method

.method public e(Lo/dir$e;)V
    .locals 0

    .line 53
    return-void
.end method
