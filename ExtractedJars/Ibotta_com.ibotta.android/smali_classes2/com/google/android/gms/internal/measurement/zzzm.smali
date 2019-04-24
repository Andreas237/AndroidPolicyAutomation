.class final Lcom/google/android/gms/internal/measurement/zzzm;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<FieldDescriptorType::",
        "Lcom/google/android/gms/internal/measurement/zzzo<",
        "TFieldDescriptorType;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final zzbru:Lcom/google/android/gms/internal/measurement/zzzm;


# instance fields
.field private zzbls:Z

.field private final zzbrs:Lcom/google/android/gms/internal/measurement/zzaay;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzaay<",
            "TFieldDescriptorType;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private zzbrt:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzzm;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzzm;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbru:Lcom/google/android/gms/internal/measurement/zzzm;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbrt:Z

    const/16 v0, 0x10

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzaay;->zzag(I)Lcom/google/android/gms/internal/measurement/zzaay;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbrs:Lcom/google/android/gms/internal/measurement/zzaay;

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbrt:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzaay;->zzag(I)Lcom/google/android/gms/internal/measurement/zzaay;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbrs:Lcom/google/android/gms/internal/measurement/zzaay;

    iget-boolean p1, p0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbls:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbrs:Lcom/google/android/gms/internal/measurement/zzaay;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzaay;->zzrg()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbls:Z

    :cond_0
    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/measurement/zzabp;Ljava/lang/Object;)V
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzzr;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzzn;->zzbrv:[I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzabp;->zzuv()Lcom/google/android/gms/internal/measurement/zzabu;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzabu;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    packed-switch p0, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    instance-of p0, p1, Lcom/google/android/gms/internal/measurement/zzaal;

    if-nez p0, :cond_0

    instance-of p0, p1, Lcom/google/android/gms/internal/measurement/zzzu;

    if-eqz p0, :cond_1

    goto :goto_0

    :pswitch_1
    instance-of p0, p1, Ljava/lang/Integer;

    if-nez p0, :cond_0

    instance-of p0, p1, Lcom/google/android/gms/internal/measurement/zzzs;

    if-eqz p0, :cond_1

    :cond_0
    :goto_0
    const/4 v1, 0x1

    goto :goto_2

    :pswitch_2
    instance-of p0, p1, Lcom/google/android/gms/internal/measurement/zzyw;

    if-nez p0, :cond_0

    instance-of p0, p1, [B

    if-eqz p0, :cond_1

    goto :goto_0

    :pswitch_3
    instance-of v0, p1, Ljava/lang/String;

    goto :goto_1

    :pswitch_4
    instance-of v0, p1, Ljava/lang/Boolean;

    goto :goto_1

    :pswitch_5
    instance-of v0, p1, Ljava/lang/Double;

    goto :goto_1

    :pswitch_6
    instance-of v0, p1, Ljava/lang/Float;

    goto :goto_1

    :pswitch_7
    instance-of v0, p1, Ljava/lang/Long;

    goto :goto_1

    :pswitch_8
    instance-of v0, p1, Ljava/lang/Integer;

    :goto_1
    move v1, v0

    :cond_1
    :goto_2
    if-eqz v1, :cond_2

    return-void

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Wrong object type used with protocol message reflection."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

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

.method private final zza(Lcom/google/android/gms/internal/measurement/zzzo;Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TFieldDescriptorType;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzzo;->zztk()Z

    move-result v0

    if-eqz v0, :cond_2

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

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
    if-ge v2, v1, :cond_0

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzzo;->zztj()Lcom/google/android/gms/internal/measurement/zzabp;

    move-result-object v4

    invoke-static {v4, v3}, Lcom/google/android/gms/internal/measurement/zzzm;->zza(Lcom/google/android/gms/internal/measurement/zzabp;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object p2, v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrong object type used with protocol message reflection."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzzo;->zztj()Lcom/google/android/gms/internal/measurement/zzabp;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/google/android/gms/internal/measurement/zzzm;->zza(Lcom/google/android/gms/internal/measurement/zzabp;Ljava/lang/Object;)V

    :goto_1
    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/zzzu;

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbrt:Z

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbrs:Lcom/google/android/gms/internal/measurement/zzaay;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzaay;->zza(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static zzti()Lcom/google/android/gms/internal/measurement/zzzm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/google/android/gms/internal/measurement/zzzo<",
            "TT;>;>()",
            "Lcom/google/android/gms/internal/measurement/zzzm<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbru:Lcom/google/android/gms/internal/measurement/zzzm;

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

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzzm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzzm;-><init>()V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbrs:Lcom/google/android/gms/internal/measurement/zzaay;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzaay;->zzuj()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbrs:Lcom/google/android/gms/internal/measurement/zzaay;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/measurement/zzaay;->zzah(I)Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzzo;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/internal/measurement/zzzm;->zza(Lcom/google/android/gms/internal/measurement/zzzo;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbrs:Lcom/google/android/gms/internal/measurement/zzaay;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzaay;->zzuk()Ljava/lang/Iterable;

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

    check-cast v3, Lcom/google/android/gms/internal/measurement/zzzo;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/internal/measurement/zzzm;->zza(Lcom/google/android/gms/internal/measurement/zzzo;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbrt:Z

    iput-boolean v1, v0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbrt:Z

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/zzzm;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzzm;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbrs:Lcom/google/android/gms/internal/measurement/zzaay;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzzm;->zzbrs:Lcom/google/android/gms/internal/measurement/zzaay;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzaay;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbrs:Lcom/google/android/gms/internal/measurement/zzaay;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzaay;->hashCode()I

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

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbrt:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzzx;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbrs:Lcom/google/android/gms/internal/measurement/zzaay;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzaay;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzzx;-><init>(Ljava/util/Iterator;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzzm;->zzbrs:Lcom/google/android/gms/internal/measurement/zzaay;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzaay;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
