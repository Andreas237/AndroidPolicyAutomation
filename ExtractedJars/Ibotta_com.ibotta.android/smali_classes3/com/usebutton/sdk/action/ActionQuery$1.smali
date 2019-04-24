.class final Lcom/usebutton/sdk/action/ActionQuery$1;
.super Ljava/lang/Object;
.source "ActionQuery.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/action/ActionQuery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/usebutton/sdk/action/ActionQuery;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/usebutton/sdk/action/ActionQuery;
    .locals 4

    .line 85
    :try_start_0
    new-instance v0, Lcom/usebutton/sdk/action/ActionQuery;

    invoke-direct {v0, p1}, Lcom/usebutton/sdk/action/ActionQuery;-><init>(Landroid/os/Parcel;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "ActionQuery"

    .line 88
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to create ActionQuery from parcel: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1, v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    new-instance p1, Lcom/usebutton/sdk/action/ActionQuery;

    invoke-direct {p1}, Lcom/usebutton/sdk/action/ActionQuery;-><init>()V

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 81
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/action/ActionQuery$1;->createFromParcel(Landroid/os/Parcel;)Lcom/usebutton/sdk/action/ActionQuery;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/usebutton/sdk/action/ActionQuery;
    .locals 0

    .line 95
    new-array p1, p1, [Lcom/usebutton/sdk/action/ActionQuery;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 81
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/action/ActionQuery$1;->newArray(I)[Lcom/usebutton/sdk/action/ActionQuery;

    move-result-object p1

    return-object p1
.end method
