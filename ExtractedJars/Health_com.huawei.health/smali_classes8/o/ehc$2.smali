.class Lo/ehc$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elb$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ehc;->d(Lo/ehv;Lo/ehe$a;)Lo/eii;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ehc;


# direct methods
.method constructor <init>(Lo/ehc;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lo/ehc$2;->b:Lo/ehc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)Z
    .locals 1

    .line 81
    const/4 v0, 0x1

    return v0
.end method

.method public e(Z)F
    .locals 2

    .line 86
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    return v0
.end method
