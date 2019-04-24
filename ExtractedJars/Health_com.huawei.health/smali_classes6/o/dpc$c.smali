.class Lo/dpc$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dpc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field private static final c:Lo/dpc;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 32
    new-instance v0, Lo/dpc;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/dpc;-><init>(Landroid/content/Context;Lo/dpc$2;)V

    sput-object v0, Lo/dpc$c;->c:Lo/dpc;

    return-void
.end method

.method static synthetic a()Lo/dpc;
    .locals 1

    .line 31
    sget-object v0, Lo/dpc$c;->c:Lo/dpc;

    return-object v0
.end method
