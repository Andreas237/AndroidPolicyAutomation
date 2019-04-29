.class final Lcom/google/android/gms/internal/measurement/zzzo;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<FieldDescriptorType::",
        "Lcom/google/android/gms/internal/measurement/zzzq<",
        "TFieldDescriptorType;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final zzbse:Lcom/google/android/gms/internal/measurement/zzzo;


# instance fields
.field private zzbme:Z

.field private final zzbsc:Lcom/google/android/gms/internal/measurement/zzaba;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzaba<",
            "TFieldDescriptorType;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private zzbsd:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzzo;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzzo;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbse:Lcom/google/android/gms/internal/measurement/zzzo;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbsd:Z

    const/16 v0, 0x10

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzaba;->zzag(I)Lcom/google/android/gms/internal/measurement/zzaba;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbsc:Lcom/google/android/gms/internal/measurement/zzaba;

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbsd:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzaba;->zzag(I)Lcom/google/android/gms/internal/measurement/zzaba;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbsc:Lcom/google/android/gms/internal/measurement/zzaba;

    iget-boolean p1, p0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbme:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbsc:Lcom/google/android/gms/internal/measurement/zzaba;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzaba;->zzrp()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbme:Z

    :cond_0
    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/measurement/zzabr;Ljava/lang/Object;)V
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzzt;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzzp;->zzbsf:[I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzabr;->zzve()Lcom/google/android/gms/internal/measurement/zzabw;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzabw;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    packed-switch p0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    instance-of p0, p1, Lcom/google/android/gms/internal/measurement/zzaan;

    if-nez p0, :cond_0

    instance-of p0, p1, Lcom/google/android/gms/internal/measurement/zzzw;

    if-eqz p0, :cond_1

    goto :goto_0

    :pswitch_1
    instance-of p0, p1, Ljava/lang/Integer;

    if-nez p0, :cond_0

    instance-of p0, p1, Lcom/google/android/gms/internal/measurement/zzzu;

    if-eqz p0, :cond_1

    :cond_0
    :goto_0
    move v1, v0

    goto :goto_1

    :pswitch_2
    instance-of p0, p1, Lcom/google/android/gms/internal/measurement/zzyy;

    if-nez p0, :cond_0

    instance-of p0, p1, [B

    if-eqz p0, :cond_1

    goto :goto_0

    :pswitch_3
    instance-of v0, p1, Ljava/lang/String;

    goto :goto_0

    :pswitch_4
    instance-of v0, p1, Ljava/lang/Boolean;

    goto :goto_0

    :pswitch_5
    instance-of v0, p1, Ljava/lang/Double;

    goto :goto_0

    :pswitch_6
    instance-of v0, p1, Ljava/lang/Float;

    goto :goto_0

    :pswitch_7
    instance-of v0, p1, Ljava/lang/Long;

    goto :goto_0

    :pswitch_8
    instance-of v0, p1, Ljava/lang/Integer;

    goto :goto_0

    :cond_1
    :goto_1
    if-nez v1, :cond_2

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Wrong object type used with protocol message reflection."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final zza(Lcom/google/android/gms/internal/measurement/zzzq;Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TFieldDescriptorType;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzzq;->zztt()Z

    move-result v0

    if-eqz v0, :cond_2

    instance-of v0, p2, Ljava/util/List;

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrong object type used with protocol message reflection."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-object p2, v0

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzzq;->zzts()Lcom/google/android/gms/internal/measurement/zzabr;

    move-result-object v4

    invoke-static {v4, v3}, Lcom/google/android/gms/internal/measurement/zzzo;->zza(Lcom/google/android/gms/internal/measurement/zzabr;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    move-object p2, v0

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzzq;->zzts()Lcom/google/android/gms/internal/measurement/zzabr;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/google/android/gms/internal/measurement/zzzo;->zza(Lcom/google/android/gms/internal/measurement/zzabr;Ljava/lang/Object;)V

    :goto_1
    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/zzzw;

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbsd:Z

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbsc:Lcom/google/android/gms/internal/measurement/zzaba;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzaba;->zza(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static zztr()Lcom/google/android/gms/internal/measurement/zzzo;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/google/android/gms/internal/measurement/zzzq<",
            "TT;>;>()",
            "Lcom/google/android/gms/internal/measurement/zzzo<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbse:Lcom/google/android/gms/internal/measurement/zzzo;

    return-object v0
.end method


# virtual methods
.method public final synthetic clone()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzzo;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzzo;-><init>()V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbsc:Lcom/google/android/gms/internal/measurement/zzaba;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzaba;->zzus()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbsc:Lcom/google/android/gms/internal/measurement/zzaba;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/measurement/zzaba;->zzah(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzzq;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/internal/measurement/zzzo;->zza(Lcom/google/android/gms/internal/measurement/zzzq;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbsc:Lcom/google/android/gms/internal/measurement/zzaba;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzaba;->zzut()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzzq;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/internal/measurement/zzzo;->zza(Lcom/google/android/gms/internal/measurement/zzzq;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbsd:Z

    iput-boolean v1, v0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbsd:Z

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/zzzo;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzzo;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbsc:Lcom/google/android/gms/internal/measurement/zzaba;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzzo;->zzbsc:Lcom/google/android/gms/internal/measurement/zzaba;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzaba;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbsc:Lcom/google/android/gms/internal/measurement/zzaba;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzaba;->hashCode()I

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TFieldDescriptorType;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbsd:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzzz;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbsc:Lcom/google/android/gms/internal/measurement/zzaba;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzaba;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzzz;-><init>(Ljava/util/Iterator;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzzo;->zzbsc:Lcom/google/android/gms/internal/measurement/zzaba;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzaba;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
