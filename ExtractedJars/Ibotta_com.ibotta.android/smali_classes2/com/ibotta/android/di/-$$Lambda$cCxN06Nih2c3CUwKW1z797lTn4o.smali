.class public final synthetic Lcom/ibotta/android/di/-$$Lambda$cCxN06Nih2c3CUwKW1z797lTn4o;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/abstractions/NetworkConnectedSupplier;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/hardware/Hardware;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/hardware/Hardware;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/di/-$$Lambda$cCxN06Nih2c3CUwKW1z797lTn4o;->f$0:Lcom/ibotta/android/hardware/Hardware;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/di/-$$Lambda$cCxN06Nih2c3CUwKW1z797lTn4o;->f$0:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {v0}, Lcom/ibotta/android/hardware/Hardware;->isNetworkConnected()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
