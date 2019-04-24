.class public Lo/ffl;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/graphics/Bitmap;)Lo/dav;
    .locals 2

    .line 35
    new-instance v1, Lo/dav;

    const/4 v0, 0x1

    invoke-direct {v1, v0}, Lo/dav;-><init>(I)V

    .line 36
    invoke-virtual {v1, p0}, Lo/dav;->e(Landroid/graphics/Bitmap;)V

    .line 37
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/dav;->e(Ljava/lang/String;)V

    .line 38
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/dav;->c(Ljava/lang/String;)V

    .line 39
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/dav;->a(Ljava/lang/String;)V

    .line 41
    sget-object v0, Lo/dae;->gO:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dav;->d(Ljava/lang/String;)V

    .line 42
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/dav;->e(I)V

    .line 43
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lo/dav;->d(Z)V

    .line 44
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/dav;->a(I)V

    .line 45
    return-object v1
.end method
