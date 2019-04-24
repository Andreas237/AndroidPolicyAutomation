.class public Lo/aux;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo/avg;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 26
    new-instance v0, Lo/avb;

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/avb;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/aux;->a:Lo/avg;

    .line 27
    sget-object v0, Lo/aux;->a:Lo/avg;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_default_pic:I

    invoke-virtual {v0, v1}, Lo/avg;->a(I)V

    .line 28
    sget-object v0, Lo/aux;->a:Lo/avg;

    invoke-static {}, Lo/bbe;->c()Lo/bbe;

    move-result-object v1

    invoke-virtual {v1}, Lo/bbe;->d()Lo/bbj;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/avg;->e(Lo/bbj;)V

    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Landroid/widget/ImageView;I)V
    .locals 2

    .line 55
    if-eqz p0, :cond_0

    .line 57
    new-instance v1, Lo/auy;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lo/auy;-><init>(IZ)V

    .line 58
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/auy;->d(Z)V

    .line 59
    sget-object v0, Lo/aux;->a:Lo/avg;

    invoke-virtual {v0, p0, v1}, Lo/avg;->a(Landroid/widget/ImageView;Lo/auy;)V

    .line 61
    :cond_0
    return-void
.end method

.method public static e(Landroid/widget/ImageView;I)V
    .locals 2

    .line 39
    if-eqz p0, :cond_0

    .line 41
    new-instance v1, Lo/auy;

    const/4 v0, 0x1

    invoke-direct {v1, p1, v0}, Lo/auy;-><init>(IZ)V

    .line 43
    sget-object v0, Lo/aux;->a:Lo/avg;

    invoke-virtual {v0, p0, v1}, Lo/avg;->a(Landroid/widget/ImageView;Lo/auy;)V

    .line 45
    :cond_0
    return-void
.end method
