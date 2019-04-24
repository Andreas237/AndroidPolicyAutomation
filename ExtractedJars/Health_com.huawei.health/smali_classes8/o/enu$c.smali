.class Lo/enu$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/enu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field private static final a:Lo/enu;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 99
    new-instance v0, Lo/enu;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/enu;-><init>(Landroid/content/Context;Lo/enu$4;)V

    sput-object v0, Lo/enu$c;->a:Lo/enu;

    return-void
.end method

.method static synthetic d()Lo/enu;
    .locals 1

    .line 98
    sget-object v0, Lo/enu$c;->a:Lo/enu;

    return-object v0
.end method
