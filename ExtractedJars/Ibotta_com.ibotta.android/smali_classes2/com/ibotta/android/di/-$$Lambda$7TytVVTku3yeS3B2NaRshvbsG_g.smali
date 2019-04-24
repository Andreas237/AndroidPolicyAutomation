.class public final synthetic Lcom/ibotta/android/di/-$$Lambda$7TytVVTku3yeS3B2NaRshvbsG_g;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/abstractions/UniqueDeviceIdSupplier;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/security/DeviceSecurity;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/security/DeviceSecurity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/di/-$$Lambda$7TytVVTku3yeS3B2NaRshvbsG_g;->f$0:Lcom/ibotta/android/security/DeviceSecurity;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/di/-$$Lambda$7TytVVTku3yeS3B2NaRshvbsG_g;->f$0:Lcom/ibotta/android/security/DeviceSecurity;

    invoke-interface {v0}, Lcom/ibotta/android/security/DeviceSecurity;->getUniqueId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
