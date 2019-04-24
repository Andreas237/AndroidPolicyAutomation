.class final Lcom/huawei/health/suggestion/data/DBFactory$p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/data/DBFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "p"
.end annotation


# static fields
.field private static final c:Lo/btq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 502
    new-instance v0, Lo/btq;

    invoke-direct {v0}, Lo/btq;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/data/DBFactory$p;->c:Lo/btq;

    return-void
.end method

.method static synthetic c()Lo/btq;
    .locals 1

    .line 501
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory$p;->c:Lo/btq;

    return-object v0
.end method
