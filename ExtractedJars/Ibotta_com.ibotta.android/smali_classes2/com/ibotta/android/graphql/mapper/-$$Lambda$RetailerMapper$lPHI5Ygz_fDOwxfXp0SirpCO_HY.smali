.class public final synthetic Lcom/ibotta/android/graphql/mapper/-$$Lambda$RetailerMapper$lPHI5Ygz_fDOwxfXp0SirpCO_HY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Supplier;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/graphql/fragment/RetailerFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/graphql/mapper/-$$Lambda$RetailerMapper$lPHI5Ygz_fDOwxfXp0SirpCO_HY;->f$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/-$$Lambda$RetailerMapper$lPHI5Ygz_fDOwxfXp0SirpCO_HY;->f$0:Lcom/ibotta/android/graphql/fragment/RetailerFragment;

    invoke-static {v0}, Lcom/ibotta/android/graphql/mapper/RetailerMapper;->lambda$map$0(Lcom/ibotta/android/graphql/fragment/RetailerFragment;)Ljava/util/HashSet;

    move-result-object v0

    return-object v0
.end method
