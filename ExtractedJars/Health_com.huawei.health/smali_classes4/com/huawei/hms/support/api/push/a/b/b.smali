.class synthetic Lcom/huawei/hms/support/api/push/a/b/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 599
    invoke-static {}, Lcom/huawei/hms/support/api/push/a/c/a;->values()[Lcom/huawei/hms/support/api/push/a/c/a;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/huawei/hms/support/api/push/a/b/b;->a:[I

    :try_start_0
    sget-object v0, Lcom/huawei/hms/support/api/push/a/b/b;->a:[I

    sget-object v1, Lcom/huawei/hms/support/api/push/a/c/a;->e:Lcom/huawei/hms/support/api/push/a/c/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/c/a;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    :goto_0
    :try_start_1
    sget-object v0, Lcom/huawei/hms/support/api/push/a/b/b;->a:[I

    sget-object v1, Lcom/huawei/hms/support/api/push/a/c/a;->f:Lcom/huawei/hms/support/api/push/a/c/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/c/a;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v3

    :goto_1
    :try_start_2
    sget-object v0, Lcom/huawei/hms/support/api/push/a/b/b;->a:[I

    sget-object v1, Lcom/huawei/hms/support/api/push/a/c/a;->g:Lcom/huawei/hms/support/api/push/a/c/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/c/a;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v3

    :goto_2
    :try_start_3
    sget-object v0, Lcom/huawei/hms/support/api/push/a/b/b;->a:[I

    sget-object v1, Lcom/huawei/hms/support/api/push/a/c/a;->i:Lcom/huawei/hms/support/api/push/a/c/a;

    invoke-virtual {v1}, Lcom/huawei/hms/support/api/push/a/c/a;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception v3

    :goto_3
    return-void
.end method
