.class Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper$1;
.super Ljava/lang/Object;
.source "ButtonInfoFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseReader$ObjectReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseReader$ObjectReader<",
        "Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper$1;->this$0:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper$1;->this$0:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper;

    iget-object v0, v0, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper;->androidFieldMapper:Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android$Mapper;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic read(Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 135
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Mapper$1;->read(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/ButtonInfoFragment$Android;

    move-result-object p1

    return-object p1
.end method
