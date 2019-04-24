.class final Lcom/huawei/health/suggestion/data/DBFactory$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/data/DBFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "g"
.end annotation


# static fields
.field private static final a:Lo/btl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 554
    new-instance v0, Lo/btl;

    invoke-direct {v0}, Lo/btl;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/data/DBFactory$g;->a:Lo/btl;

    return-void
.end method

.method static synthetic e()Lo/btl;
    .locals 1

    .line 553
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory$g;->a:Lo/btl;

    return-object v0
.end method
