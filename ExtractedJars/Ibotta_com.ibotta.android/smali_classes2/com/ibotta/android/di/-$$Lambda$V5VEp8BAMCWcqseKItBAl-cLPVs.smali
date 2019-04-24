.class public final synthetic Lcom/ibotta/android/di/-$$Lambda$V5VEp8BAMCWcqseKItBAl-cLPVs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/abstractions/IpAddressSupplier;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/hardware/Hardware;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/hardware/Hardware;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/di/-$$Lambda$V5VEp8BAMCWcqseKItBAl-cLPVs;->f$0:Lcom/ibotta/android/hardware/Hardware;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/di/-$$Lambda$V5VEp8BAMCWcqseKItBAl-cLPVs;->f$0:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {v0}, Lcom/ibotta/android/hardware/Hardware;->getLocalIpAddress()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
