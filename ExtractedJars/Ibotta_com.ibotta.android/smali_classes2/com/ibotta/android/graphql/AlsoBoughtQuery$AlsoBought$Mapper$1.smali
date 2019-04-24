.class Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Mapper$1;
.super Ljava/lang/Object;
.source "AlsoBoughtQuery.java"

# interfaces
.implements Lcom/apollographql/apollo/api/ResponseReader$ConditionalTypeReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/apollographql/apollo/api/ResponseReader$ConditionalTypeReader<",
        "Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Mapper;


# direct methods
.method constructor <init>(Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Mapper;)V
    .locals 0

    .line 534
    iput-object p1, p0, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Mapper$1;->this$0:Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Mapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Ljava/lang/String;Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;
    .locals 1

    .line 537
    iget-object v0, p0, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Mapper$1;->this$0:Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Mapper;

    iget-object v0, v0, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Mapper;->fragmentsFieldMapper:Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments$Mapper;

    invoke-virtual {v0, p2, p1}, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments$Mapper;->map(Lcom/apollographql/apollo/api/ResponseReader;Ljava/lang/String;)Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic read(Ljava/lang/String;Lcom/apollographql/apollo/api/ResponseReader;)Ljava/lang/Object;
    .locals 0

    .line 534
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Mapper$1;->read(Ljava/lang/String;Lcom/apollographql/apollo/api/ResponseReader;)Lcom/ibotta/android/graphql/AlsoBoughtQuery$AlsoBought$Fragments;

    move-result-object p1

    return-object p1
.end method
