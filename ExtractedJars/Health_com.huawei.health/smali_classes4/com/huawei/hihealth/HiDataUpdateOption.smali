.class public Lcom/huawei/hihealth/HiDataUpdateOption;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiDataUpdateOption;>;"
        }
    .end annotation
.end field


# instance fields
.field private type:I

.field private valueHolder:Landroid/content/ContentValues;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    new-instance v0, Lcom/huawei/hihealth/HiDataUpdateOption$4;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiDataUpdateOption$4;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/HiDataUpdateOption;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const/16 v0, 0x64

    iput v0, p0, Lcom/huawei/hihealth/HiDataUpdateOption;->type:I

    .line 25
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataUpdateOption;->valueHolder:Landroid/content/ContentValues;

    .line 26
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const/16 v0, 0x64

    iput v0, p0, Lcom/huawei/hihealth/HiDataUpdateOption;->type:I

    .line 20
    iput p1, p0, Lcom/huawei/hihealth/HiDataUpdateOption;->type:I

    .line 21
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataUpdateOption;->valueHolder:Landroid/content/ContentValues;

    .line 22
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const/16 v0, 0x64

    iput v0, p0, Lcom/huawei/hihealth/HiDataUpdateOption;->type:I

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiDataUpdateOption;->type:I

    .line 41
    const-class v0, Landroid/content/ContentValues;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/ContentValues;

    iput-object v0, p0, Lcom/huawei/hihealth/HiDataUpdateOption;->valueHolder:Landroid/content/ContentValues;

    .line 42
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 30
    const/4 v0, 0x0

    return v0
.end method

.method public getBoolean(Ljava/lang/String;)Z
    .locals 2

    .line 81
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataUpdateOption;->valueHolder:Landroid/content/ContentValues;

    invoke-virtual {v0, p1}, Landroid/content/ContentValues;->getAsBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    .line 82
    if-nez v1, :cond_0

    .line 83
    const/4 v0, 0x0

    return v0

    .line 85
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataUpdateOption;->valueHolder:Landroid/content/ContentValues;

    invoke-virtual {v0, p1}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 89
    iget v0, p0, Lcom/huawei/hihealth/HiDataUpdateOption;->type:I

    return v0
.end method

.method public putBoolean(Ljava/lang/String;Z)V
    .locals 2

    .line 76
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataUpdateOption;->valueHolder:Landroid/content/ContentValues;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 77
    return-void
.end method

.method public final putString(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataUpdateOption;->valueHolder:Landroid/content/ContentValues;

    invoke-virtual {v0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 93
    iput p1, p0, Lcom/huawei/hihealth/HiDataUpdateOption;->type:I

    .line 94
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 35
    iget v0, p0, Lcom/huawei/hihealth/HiDataUpdateOption;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 36
    iget-object v0, p0, Lcom/huawei/hihealth/HiDataUpdateOption;->valueHolder:Landroid/content/ContentValues;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 37
    return-void
.end method
