.class Lcom/ibotta/android/graphql/fragment/CategoryFragment$Mapper$1;
.super Ljava/lang/Object;
.source "CategoryFragment.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseReader$ListReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/fragment/CategoryFragment$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/fragment/CategoryFragment;
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
.field final synthetic this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment$Mapper;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/fragment/CategoryFragment$Mapper;)V
    .locals 0

    .line 402
    iput-object p1, p0, Lcom/ibotta/android/graphql/fragment/CategoryFragment$Mapper$1;->this$0:Lcom/ibotta/android/graphql/fragment/CategoryFragment$Mapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;)Ljava/lang/Long;
    .locals 0

    .line 405
    invoke-interface {p1}, Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;->readLong()Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic read(Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;)Ljava/lang/Object;
    .locals 0

    .line 402
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/fragment/CategoryFragment$Mapper$1;->read(Lcom/apollographql/apollo/api/ResponseReader$ListItemReader;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
