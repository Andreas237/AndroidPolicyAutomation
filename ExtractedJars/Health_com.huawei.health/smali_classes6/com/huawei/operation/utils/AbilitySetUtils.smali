.class public Lcom/huawei/operation/utils/AbilitySetUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/operation/utils/AbilitySetUtils$AbilityObj;
    }
.end annotation


# static fields
.field private static final DEFAULT_APP_TYPE:I = 0x0

.field private static final FITNESS_DATA_ABILITY:Ljava/lang/String; = "fitness"

.field private static final HEALTH_APP_TYPE:I = 0x2

.field private static final HEALTH_DETAIL_ABILITY:Ljava/lang/String; = "healthDetail"

.field private static final HEALTH_STAT_ABILITY:Ljava/lang/String; = "healthStat"

.field private static final MOTION_PATH_ABILITY:Ljava/lang/String; = "motionPath"

.field private static final PAY_ABILITY:Ljava/lang/String; = "pay"

.field private static final SCHEME_ABILITY:Ljava/lang/String; = "scheme"

.field private static final SECURITY_ABILITY:Ljava/lang/String; = "security"

.field private static final SOCIALITY_ABILITY:Ljava/lang/String; = "sociality"

.field private static final SYSTEM_ABILITY:Ljava/lang/String; = "system"

.field private static final WEAR_APP_TYPE:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getAbilitySet()Ljava/lang/String;
    .locals 4

    .line 36
    new-instance v2, Lcom/huawei/operation/utils/AbilitySetUtils$AbilityObj;

    invoke-direct {v2}, Lcom/huawei/operation/utils/AbilitySetUtils$AbilityObj;-><init>()V

    .line 37
    const-string v0, "motionPath"

    const/4 v1, 0x3

    invoke-virtual {v2, v0, v1}, Lcom/huawei/operation/utils/AbilitySetUtils$AbilityObj;->add(Ljava/lang/String;I)V

    .line 38
    const-string v0, "sociality"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Lcom/huawei/operation/utils/AbilitySetUtils$AbilityObj;->add(Ljava/lang/String;I)V

    .line 39
    const-string v0, "pay"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Lcom/huawei/operation/utils/AbilitySetUtils$AbilityObj;->add(Ljava/lang/String;I)V

    .line 40
    const-string v0, "scheme"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Lcom/huawei/operation/utils/AbilitySetUtils$AbilityObj;->add(Ljava/lang/String;I)V

    .line 41
    const-string v0, "fitness"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Lcom/huawei/operation/utils/AbilitySetUtils$AbilityObj;->add(Ljava/lang/String;I)V

    .line 42
    const-string v0, "system"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Lcom/huawei/operation/utils/AbilitySetUtils$AbilityObj;->add(Ljava/lang/String;I)V

    .line 43
    const-string v0, "security"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Lcom/huawei/operation/utils/AbilitySetUtils$AbilityObj;->add(Ljava/lang/String;I)V

    .line 44
    const-string v0, "healthDetail"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Lcom/huawei/operation/utils/AbilitySetUtils$AbilityObj;->add(Ljava/lang/String;I)V

    .line 45
    const-string v0, "healthStat"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Lcom/huawei/operation/utils/AbilitySetUtils$AbilityObj;->add(Ljava/lang/String;I)V

    .line 46
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/operation/utils/AbilitySetUtils$AbilityObj;->setAppType(I)V

    .line 47
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 48
    return-object v3
.end method
