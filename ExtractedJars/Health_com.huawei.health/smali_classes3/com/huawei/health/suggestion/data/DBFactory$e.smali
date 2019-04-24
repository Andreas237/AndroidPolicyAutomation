.class final Lcom/huawei/health/suggestion/data/DBFactory$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/data/DBFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# static fields
.field private static final d:Lo/bsz;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 522
    new-instance v0, Lo/bsz;

    invoke-direct {v0}, Lo/bsz;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/data/DBFactory$e;->d:Lo/bsz;

    return-void
.end method

.method static synthetic c()Lo/bsz;
    .locals 1

    .line 521
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory$e;->d:Lo/bsz;

    return-object v0
.end method
