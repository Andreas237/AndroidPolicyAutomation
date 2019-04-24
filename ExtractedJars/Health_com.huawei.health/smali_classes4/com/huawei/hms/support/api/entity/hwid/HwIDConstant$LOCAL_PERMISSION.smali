.class public Lcom/huawei/hms/support/api/entity/hwid/HwIDConstant$LOCAL_PERMISSION;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/support/api/entity/hwid/HwIDConstant;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LOCAL_PERMISSION"
.end annotation


# static fields
.field public static final ACCESS_TOKEN:Ljava/lang/String; = "https://www.huawei.com/auth/account/base.profile/accesstoken"

.field public static final SERVICE_AUTH_CODE:Ljava/lang/String; = "https://www.huawei.com/auth/account/base.profile/serviceauthcode"

.field public static final SERVICE_COUNTRY_CODE:Ljava/lang/String; = "https://www.huawei.com/auth/account/base.profile/servicecountrycode"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 201
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
