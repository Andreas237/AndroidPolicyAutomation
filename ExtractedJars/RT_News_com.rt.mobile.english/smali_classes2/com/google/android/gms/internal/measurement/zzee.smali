.class public final Lcom/google/android/gms/internal/measurement/zzee;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Class;
    creator = "ConditionalUserPropertyParcelCreator"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/measurement/zzee;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public active:Z
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x6
    .end annotation
.end field

.field public creationTimestamp:J
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x5
    .end annotation
.end field

.field public origin:Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x3
    .end annotation
.end field

.field public packageName:Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x2
    .end annotation
.end field

.field public timeToLive:J
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0xb
    .end annotation
.end field

.field public triggerEventName:Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x7
    .end annotation
.end field

.field public triggerTimeout:J
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x9
    .end annotation
.end field

.field public zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x4
    .end annotation
.end field

.field public zzaer:Lcom/google/android/gms/internal/measurement/zzew;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x8
    .end annotation
.end field

.field public zzaes:Lcom/google/android/gms/internal/measurement/zzew;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0xa
    .end annotation
.end field

.field public zzaet:Lcom/google/android/gms/internal/measurement/zzew;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0xc
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzef;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzef;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzee;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzee;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzee;->origin:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzee;->origin:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iget-wide v0, p1, Lcom/google/android/gms/internal/measurement/zzee;->creationTimestamp:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzee;->creationTimestamp:J

    iget-boolean v0, p1, Lcom/google/android/gms/internal/measurement/zzee;->active:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzee;->active:Z

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzee;->triggerEventName:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzee;->triggerEventName:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzee;->zzaer:Lcom/google/android/gms/internal/measurement/zzew;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzee;->zzaer:Lcom/google/android/gms/internal/measurement/zzew;

    iget-wide v0, p1, Lcom/google/android/gms/internal/measurement/zzee;->triggerTimeout:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzee;->triggerTimeout:J

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzee;->zzaes:Lcom/google/android/gms/internal/measurement/zzew;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzee;->zzaes:Lcom/google/android/gms/internal/measurement/zzew;

    iget-wide v0, p1, Lcom/google/android/gms/internal/measurement/zzee;->timeToLive:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzee;->timeToLive:J

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzee;->zzaet:Lcom/google/android/gms/internal/measurement/zzew;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzee;->zzaet:Lcom/google/android/gms/internal/measurement/zzew;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzjz;JZLjava/lang/String;Lcom/google/android/gms/internal/measurement/zzew;JLcom/google/android/gms/internal/measurement/zzew;JLcom/google/android/gms/internal/measurement/zzew;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x2
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x3
        .end annotation
    .end param
    .param p3    # Lcom/google/android/gms/internal/measurement/zzjz;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x4
        .end annotation
    .end param
    .param p4    # J
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x5
        .end annotation
    .end param
    .param p6    # Z
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x6
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x7
        .end annotation
    .end param
    .param p8    # Lcom/google/android/gms/internal/measurement/zzew;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x8
        .end annotation
    .end param
    .param p9    # J
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x9
        .end annotation
    .end param
    .param p11    # Lcom/google/android/gms/internal/measurement/zzew;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0xa
        .end annotation
    .end param
    .param p12    # J
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0xb
        .end annotation
    .end param
    .param p14    # Lcom/google/android/gms/internal/measurement/zzew;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0xc
        .end annotation
    .end param
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Constructor;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzee;->origin:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    iput-wide p4, p0, Lcom/google/android/gms/internal/measurement/zzee;->creationTimestamp:J

    iput-boolean p6, p0, Lcom/google/android/gms/internal/measurement/zzee;->active:Z

    iput-object p7, p0, Lcom/google/android/gms/internal/measurement/zzee;->triggerEventName:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/measurement/zzee;->zzaer:Lcom/google/android/gms/internal/measurement/zzew;

    iput-wide p9, p0, Lcom/google/android/gms/internal/measurement/zzee;->triggerTimeout:J

    iput-object p11, p0, Lcom/google/android/gms/internal/measurement/zzee;->zzaes:Lcom/google/android/gms/internal/measurement/zzew;

    iput-wide p12, p0, Lcom/google/android/gms/internal/measurement/zzee;->timeToLive:J

    iput-object p14, p0, Lcom/google/android/gms/internal/measurement/zzee;->zzaet:Lcom/google/android/gms/internal/measurement/zzew;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->beginObjectHeader(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzee;->packageName:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeString(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzee;->origin:Ljava/lang/String;

    const/4 v3, 0x3

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeString(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzee;->zzaeq:Lcom/google/android/gms/internal/measurement/zzjz;

    const/4 v3, 0x4

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzee;->creationTimestamp:J

    const/4 v1, 0x5

    invoke-static {p1, v1, v3, v4}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeLong(Landroid/os/Parcel;IJ)V

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzee;->active:Z

    const/4 v3, 0x6

    invoke-static {p1, v3, v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeBoolean(Landroid/os/Parcel;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzee;->triggerEventName:Ljava/lang/String;

    const/4 v3, 0x7

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeString(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzee;->zzaer:Lcom/google/android/gms/internal/measurement/zzew;

    const/16 v3, 0x8

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzee;->triggerTimeout:J

    const/16 v1, 0x9

    invoke-static {p1, v1, v3, v4}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeLong(Landroid/os/Parcel;IJ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzee;->zzaes:Lcom/google/android/gms/internal/measurement/zzew;

    const/16 v3, 0xa

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzee;->timeToLive:J

    const/16 v1, 0xb

    invoke-static {p1, v1, v3, v4}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeLong(Landroid/os/Parcel;IJ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzee;->zzaet:Lcom/google/android/gms/internal/measurement/zzew;

    const/16 v3, 0xc

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->finishObjectHeader(Landroid/os/Parcel;I)V

    return-void
.end method
