.class public final synthetic Lcom/ibotta/android/graphql/interceptor/-$$Lambda$4hpkswh1sWxc7hcEk48wJ5F1hbA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Supplier;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/api/HttpHeaders;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/api/HttpHeaders;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/graphql/interceptor/-$$Lambda$4hpkswh1sWxc7hcEk48wJ5F1hbA;->f$0:Lcom/ibotta/api/HttpHeaders;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/graphql/interceptor/-$$Lambda$4hpkswh1sWxc7hcEk48wJ5F1hbA;->f$0:Lcom/ibotta/api/HttpHeaders;

    invoke-virtual {v0}, Lcom/ibotta/api/HttpHeaders;->getUserLocation()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
