.class public Lo/aqx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Lo/aqw;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 30
    new-instance v0, Lo/aqv;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/aqv;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/aqx;->e:Lo/aqw;

    .line 31
    sget-object v0, Lo/aqx;->e:Lo/aqw;

    invoke-static {}, Lo/bbe;->c()Lo/bbe;

    move-result-object v1

    invoke-virtual {v1}, Lo/bbe;->d()Lo/bbj;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/aqw;->c(Lo/bbj;)V

    .line 32
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 4

    .line 42
    if-eqz p0, :cond_0

    .line 44
    new-instance v2, Lo/ard;

    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-direct {v2, p1, v0, v1}, Lo/ard;-><init>(Ljava/lang/String;ZZ)V

    .line 45
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->o()I

    move-result v3

    .line 46
    invoke-virtual {v2, v3}, Lo/ard;->d(I)V

    .line 47
    invoke-virtual {v2, v3}, Lo/ard;->b(I)V

    .line 48
    sget-object v0, Lo/aqx;->e:Lo/aqw;

    invoke-virtual {v0, p0, v2}, Lo/aqw;->e(Landroid/widget/ImageView;Lo/ard;)V

    .line 50
    :cond_0
    return-void
.end method

.method public static d(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 4

    .line 60
    if-eqz p0, :cond_0

    .line 62
    new-instance v2, Lo/ard;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {v2, p1, v0, v1}, Lo/ard;-><init>(Ljava/lang/String;ZZ)V

    .line 64
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->h()I

    move-result v3

    .line 65
    invoke-virtual {v2, v3}, Lo/ard;->d(I)V

    .line 66
    invoke-virtual {v2, v3}, Lo/ard;->b(I)V

    .line 67
    sget-object v0, Lo/aqx;->e:Lo/aqw;

    invoke-virtual {v0, p0, v2}, Lo/aqw;->e(Landroid/widget/ImageView;Lo/ard;)V

    .line 69
    :cond_0
    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 3

    .line 90
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    const-string v1, "image"

    invoke-virtual {v0, p0, v1}, Lo/bbh;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 91
    invoke-static {v2}, Lo/aqr;->a(Ljava/lang/String;)Z

    .line 92
    return-void
.end method

.method public static d(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 79
    sget-object v0, Lo/aqx;->e:Lo/aqw;

    invoke-virtual {v0, p0, p1}, Lo/aqw;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 80
    return-void
.end method
