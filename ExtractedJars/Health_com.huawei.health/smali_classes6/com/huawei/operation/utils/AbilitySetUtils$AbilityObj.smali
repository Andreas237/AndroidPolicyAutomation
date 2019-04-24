.class Lcom/huawei/operation/utils/AbilitySetUtils$AbilityObj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/operation/utils/AbilitySetUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AbilityObj"
.end annotation


# instance fields
.field private abilityMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private appType:I


# direct methods
.method constructor <init>()V
    .locals 1

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/operation/utils/AbilitySetUtils$AbilityObj;->abilityMap:Ljava/util/Map;

    .line 59
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/String;I)V
    .locals 2

    .line 62
    iget-object v0, p0, Lcom/huawei/operation/utils/AbilitySetUtils$AbilityObj;->abilityMap:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    return-void
.end method

.method public getAppType()I
    .locals 1

    .line 70
    iget v0, p0, Lcom/huawei/operation/utils/AbilitySetUtils$AbilityObj;->appType:I

    return v0
.end method

.method public setAppType(I)V
    .locals 0

    .line 66
    iput p1, p0, Lcom/huawei/operation/utils/AbilitySetUtils$AbilityObj;->appType:I

    .line 67
    return-void
.end method
