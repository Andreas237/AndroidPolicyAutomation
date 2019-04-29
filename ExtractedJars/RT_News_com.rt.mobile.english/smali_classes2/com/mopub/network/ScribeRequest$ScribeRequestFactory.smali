.class public interface abstract Lcom/mopub/network/ScribeRequest$ScribeRequestFactory;
.super Ljava/lang/Object;
.source "ScribeRequest.java"

# interfaces
.implements Lcom/mopub/network/RequestManager$RequestFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/network/ScribeRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ScribeRequestFactory"
.end annotation


# virtual methods
.method public abstract createRequest(Lcom/mopub/network/ScribeRequest$Listener;)Lcom/mopub/network/ScribeRequest;
.end method
