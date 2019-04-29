.class public final Lcom/google/android/gms/signin/SignInOptions;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/Api$ApiOptions$Optional;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/signin/SignInOptions$Builder;
    }
.end annotation


# static fields
.field public static final DEFAULT:Lcom/google/android/gms/signin/SignInOptions;


# instance fields
.field private final zzadb:Z

.field private final zzadc:Z

.field private final zzadd:Ljava/lang/Long;

.field private final zzade:Ljava/lang/Long;

.field private final zzt:Z

.field private final zzv:Z

.field private final zzw:Ljava/lang/String;

.field private final zzx:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/signin/SignInOptions$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/signin/SignInOptions$Builder;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/signin/SignInOptions$Builder;->build()Lcom/google/android/gms/signin/SignInOptions;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/signin/SignInOptions;->DEFAULT:Lcom/google/android/gms/signin/SignInOptions;

    return-void
.end method

.method private constructor <init>(ZZLjava/lang/String;ZLjava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/signin/SignInOptions;->zzadb:Z

    iput-boolean p2, p0, Lcom/google/android/gms/signin/SignInOptions;->zzt:Z

    iput-object p3, p0, Lcom/google/android/gms/signin/SignInOptions;->zzw:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/signin/SignInOptions;->zzv:Z

    iput-boolean p6, p0, Lcom/google/android/gms/signin/SignInOptions;->zzadc:Z

    iput-object p5, p0, Lcom/google/android/gms/signin/SignInOptions;->zzx:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/signin/SignInOptions;->zzadd:Ljava/lang/Long;

    iput-object p8, p0, Lcom/google/android/gms/signin/SignInOptions;->zzade:Ljava/lang/Long;

    return-void
.end method

.method synthetic constructor <init>(ZZLjava/lang/String;ZLjava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;Lcom/google/android/gms/signin/zzc;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Lcom/google/android/gms/signin/SignInOptions;-><init>(ZZLjava/lang/String;ZLjava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;)V

    return-void
.end method


# virtual methods
.method public final getAuthApiSignInModuleVersion()Ljava/lang/Long;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/signin/SignInOptions;->zzadd:Ljava/lang/Long;

    return-object v0
.end method

.method public final getHostedDomain()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/signin/SignInOptions;->zzx:Ljava/lang/String;

    return-object v0
.end method

.method public final getRealClientLibraryVersion()Ljava/lang/Long;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/signin/SignInOptions;->zzade:Ljava/lang/Long;

    return-object v0
.end method

.method public final getServerClientId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/signin/SignInOptions;->zzw:Ljava/lang/String;

    return-object v0
.end method

.method public final isForceCodeForRefreshToken()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/signin/SignInOptions;->zzv:Z

    return v0
.end method

.method public final isIdTokenRequested()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/signin/SignInOptions;->zzt:Z

    return v0
.end method

.method public final isOfflineAccessRequested()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/signin/SignInOptions;->zzadb:Z

    return v0
.end method

.method public final waitForAccessTokenRefresh()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/signin/SignInOptions;->zzadc:Z

    return v0
.end method
