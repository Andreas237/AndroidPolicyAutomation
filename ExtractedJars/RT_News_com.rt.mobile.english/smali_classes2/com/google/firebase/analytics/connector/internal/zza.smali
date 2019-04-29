.class final synthetic Lcom/google/firebase/analytics/connector/internal/zza;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/components/ComponentFactory;


# static fields
.field static final zzbos:Lcom/google/firebase/components/ComponentFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/analytics/connector/internal/zza;

    invoke-direct {v0}, Lcom/google/firebase/analytics/connector/internal/zza;-><init>()V

    sput-object v0, Lcom/google/firebase/analytics/connector/internal/zza;->zzbos:Lcom/google/firebase/components/ComponentFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/google/firebase/components/ComponentContainer;)Ljava/lang/Object;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p1, v0}, Lcom/google/firebase/components/ComponentContainer;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lcom/google/firebase/analytics/connector/AnalyticsConnectorImpl;->getInstance(Landroid/content/Context;)Lcom/google/firebase/analytics/connector/AnalyticsConnector;

    move-result-object p1

    return-object p1
.end method
