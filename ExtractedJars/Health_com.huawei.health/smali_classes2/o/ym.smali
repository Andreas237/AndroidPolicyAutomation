.class public Lo/ym;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/yk$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    new-instance v0, Lo/ym;

    invoke-direct {v0}, Lo/ym;-><init>()V

    .line 26
    invoke-static {v0}, Lo/yk;->d(Lo/yk$a;)V

    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Lo/yr;
    .locals 2

    .line 31
    new-instance v0, Lo/ys;

    sget v1, Lcom/huawei/cp3/R$style;->CustomDialogTheme:I

    invoke-direct {v0, p1, v1}, Lo/ys;-><init>(Landroid/content/Context;I)V

    return-object v0
.end method

.method public e(Landroid/content/Context;)Lo/yw;
    .locals 2

    .line 36
    new-instance v0, Lo/yq;

    sget v1, Lcom/huawei/cp3/R$style;->CustomDialogTheme:I

    invoke-direct {v0, p1, v1}, Lo/yq;-><init>(Landroid/content/Context;I)V

    return-object v0
.end method
