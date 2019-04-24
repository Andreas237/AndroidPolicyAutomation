.class public Lcom/huawei/hwid/core/constants/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/constants/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static final a:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 139
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "curName"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "bindFingetUserId"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hwid/core/constants/a$a;->a:[Ljava/lang/String;

    return-void
.end method

.method public static final a()[Ljava/lang/String;
    .locals 5

    .line 142
    sget-object v0, Lcom/huawei/hwid/core/constants/a$a;->a:[Ljava/lang/String;

    array-length v0, v0

    new-array v4, v0, [Ljava/lang/String;

    .line 143
    sget-object v0, Lcom/huawei/hwid/core/constants/a$a;->a:[Ljava/lang/String;

    sget-object v1, Lcom/huawei/hwid/core/constants/a$a;->a:[Ljava/lang/String;

    array-length v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v4, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 144
    return-object v4
.end method
