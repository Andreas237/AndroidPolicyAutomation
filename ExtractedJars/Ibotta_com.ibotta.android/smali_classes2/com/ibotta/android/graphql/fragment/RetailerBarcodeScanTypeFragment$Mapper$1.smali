.class Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment$Mapper$1;
.super Ljava/lang/Object;
.source "RetailerBarcodeScanTypeFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseReader$ListReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseReader$ListReader<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment$Mapper;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment$Mapper;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment$Mapper$1;->this$0:Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment$Mapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;)Ljava/lang/Long;
    .locals 0

    .line 139
    invoke-interface {p1}, Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;->readLong()Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic read(Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;)Ljava/lang/Object;
    .locals 0

    .line 136
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/RetailerBarcodeScanTypeFragment$Mapper$1;->read(Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
