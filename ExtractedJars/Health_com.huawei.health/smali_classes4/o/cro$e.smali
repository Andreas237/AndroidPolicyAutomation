.class Lo/cro$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cro;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lcom/huawei/hihealth/HiHealthData;>;Ljava/io/Serializable;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/cro$1;)V
    .locals 0

    .line 99
    invoke-direct {p0}, Lo/cro$e;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;)I
    .locals 2

    .line 103
    invoke-virtual {p2}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v1

    invoke-static {v0, v1}, Lo/cpj;->d(II)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 99
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    move-object v1, p2

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {p0, v0, v1}, Lo/cro$e;->b(Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;)I

    move-result v0

    return v0
.end method