.class final Lcom/huawei/health/suggestion/data/DBFactory$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/data/DBFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "h"
.end annotation


# static fields
.field private static final a:Lo/btg;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 534
    new-instance v0, Lo/btg;

    invoke-direct {v0}, Lo/btg;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/data/DBFactory$h;->a:Lo/btg;

    return-void
.end method

.method static synthetic a()Lo/btg;
    .locals 1

    .line 533
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory$h;->a:Lo/btg;

    return-object v0
.end method
