.class public final synthetic Lcom/ibotta/android/graphql/mapper/-$$Lambda$BaseMapper$X3OiAtVPJMs9TnGmf3SfP_Pw0qI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Supplier;


# instance fields
.field private final synthetic f$0:Ljava/lang/Number;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Number;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/graphql/mapper/-$$Lambda$BaseMapper$X3OiAtVPJMs9TnGmf3SfP_Pw0qI;->f$0:Ljava/lang/Number;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/-$$Lambda$BaseMapper$X3OiAtVPJMs9TnGmf3SfP_Pw0qI;->f$0:Ljava/lang/Number;

    invoke-static {v0}, Lcom/ibotta/android/graphql/mapper/BaseMapper;->lambda$asInt$2(Ljava/lang/Number;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
