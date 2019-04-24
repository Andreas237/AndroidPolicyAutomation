.class public Lcom/huawei/hwid/core/b/a/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/b/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    invoke-static {}, Lcom/huawei/hwid/vermanager/c;->a()Lcom/huawei/hwid/vermanager/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/vermanager/d;->a()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/core/b/a/a$d;->a:Ljava/lang/String;

    .line 46
    invoke-static {}, Lcom/huawei/hwid/vermanager/c;->a()Lcom/huawei/hwid/vermanager/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/vermanager/d;->b()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/core/b/a/a$d;->b:Ljava/lang/String;

    .line 47
    invoke-static {}, Lcom/huawei/hwid/vermanager/c;->a()Lcom/huawei/hwid/vermanager/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/vermanager/d;->c()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/core/b/a/a$d;->c:Ljava/lang/String;

    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 43
    sget-object v0, Lcom/huawei/hwid/core/b/a/a$d;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    .line 43
    sget-object v0, Lcom/huawei/hwid/core/b/a/a$d;->b:Ljava/lang/String;

    return-object v0
.end method
