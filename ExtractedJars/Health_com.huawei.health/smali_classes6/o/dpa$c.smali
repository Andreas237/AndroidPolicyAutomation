.class Lo/dpa$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dpa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field private static final e:Lo/dpa;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 33
    new-instance v0, Lo/dpa;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/dpa;-><init>(Landroid/content/Context;Lo/dpa$2;)V

    sput-object v0, Lo/dpa$c;->e:Lo/dpa;

    return-void
.end method

.method static synthetic c()Lo/dpa;
    .locals 1

    .line 32
    sget-object v0, Lo/dpa$c;->e:Lo/dpa;

    return-object v0
.end method
