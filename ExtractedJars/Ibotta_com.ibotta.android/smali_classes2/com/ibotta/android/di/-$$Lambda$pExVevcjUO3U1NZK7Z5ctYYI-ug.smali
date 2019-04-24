.class public final synthetic Lcom/ibotta/android/di/-$$Lambda$pExVevcjUO3U1NZK7Z5ctYYI-ug;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/abstractions/GoogleAidSupplier;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/state/app/google/GoogleState;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/state/app/google/GoogleState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/di/-$$Lambda$pExVevcjUO3U1NZK7Z5ctYYI-ug;->f$0:Lcom/ibotta/android/state/app/google/GoogleState;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/di/-$$Lambda$pExVevcjUO3U1NZK7Z5ctYYI-ug;->f$0:Lcom/ibotta/android/state/app/google/GoogleState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/google/GoogleState;->getGoogleAID()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
