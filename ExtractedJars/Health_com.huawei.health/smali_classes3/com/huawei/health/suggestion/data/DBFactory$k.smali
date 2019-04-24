.class final Lcom/huawei/health/suggestion/data/DBFactory$k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/data/DBFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "k"
.end annotation


# static fields
.field private static final a:Lo/btf;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 546
    new-instance v0, Lo/btf;

    invoke-direct {v0}, Lo/btf;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/data/DBFactory$k;->a:Lo/btf;

    return-void
.end method

.method static synthetic a()Lo/btf;
    .locals 1

    .line 545
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory$k;->a:Lo/btf;

    return-object v0
.end method
