.class public Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;
.super Ljava/lang/Object;
.source "ZoneParcelable.java"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/zone/ZoneParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ActionParcelable"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final appliesToTriggers:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final triggerId:Ljava/lang/String;

.field private final type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 286
    new-instance v0, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable$1;

    invoke-direct {v0}, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable$1;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 270
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 271
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->type:Ljava/lang/String;

    .line 272
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->triggerId:Ljava/lang/String;

    .line 273
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->appliesToTriggers:Ljava/util/ArrayList;

    .line 274
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->appliesToTriggers:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readStringList(Ljava/util/List;)V

    return-void
.end method

.method constructor <init>(Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Action;)V
    .locals 1

    .line 262
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 263
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Action;->type:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Action;->type:Ljava/lang/String;

    :goto_0
    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->type:Ljava/lang/String;

    .line 264
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Action;->triggerId:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, ""

    goto :goto_1

    :cond_1
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Action;->triggerId:Ljava/lang/String;

    :goto_1
    iput-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->triggerId:Ljava/lang/String;

    .line 265
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Action;->appliesToTriggers:Ljava/util/ArrayList;

    if-nez v0, :cond_2

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    goto :goto_2

    :cond_2
    iget-object p1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Action;->appliesToTriggers:Ljava/util/ArrayList;

    :goto_2
    iput-object p1, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->appliesToTriggers:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAppliesToTriggers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 259
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->appliesToTriggers:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getTriggerId()Ljava/lang/String;
    .locals 1

    .line 258
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->triggerId:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 257
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->type:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 280
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->type:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 281
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->triggerId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 282
    iget-object p2, p0, Lcom/shopkick/sdk/zone/ZoneParcelable$ActionParcelable;->appliesToTriggers:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    return-void
.end method
