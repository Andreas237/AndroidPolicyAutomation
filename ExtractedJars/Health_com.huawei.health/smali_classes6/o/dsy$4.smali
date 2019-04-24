.class final Lo/dsy$4;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dsy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Integer;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 2

    .line 53
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 61
    const-string v0, "android.permission.READ_PHONE_STATE"

    sget v1, Lcom/huawei/paycommonbase/R$string;->read_phone_state:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/dsy$4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    const-string v0, "android.permission.GET_ACCOUNTS"

    sget v1, Lcom/huawei/paycommonbase/R$string;->get_accounts:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/dsy$4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    const-string v0, "android.permission.READ_SMS"

    sget v1, Lcom/huawei/paycommonbase/R$string;->read_sms:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/dsy$4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    sget v1, Lcom/huawei/paycommonbase/R$string;->write_external_storage:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/dsy$4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    sget v1, Lcom/huawei/paycommonbase/R$string;->access_fine_location:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/dsy$4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    sget v1, Lcom/huawei/paycommonbase/R$string;->access_coarse_location:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/dsy$4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    const-string v0, "android.permission.CAMERA"

    sget v1, Lcom/huawei/paycommonbase/R$string;->camera:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/dsy$4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    const-string v0, "android.permission.READ_CONTACTS"

    sget v1, Lcom/huawei/paycommonbase/R$string;->read_contacts:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/dsy$4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    return-void
.end method
