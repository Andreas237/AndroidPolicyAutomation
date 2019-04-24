.class Lo/elb$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elb$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/elb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/elb;


# direct methods
.method constructor <init>(Lo/elb;)V
    .locals 0

    .line 365
    iput-object p1, p0, Lo/elb$5;->e:Lo/elb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)Z
    .locals 0

    .line 368
    return p1
.end method

.method public e(Z)F
    .locals 2

    .line 374
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    return v0
.end method
