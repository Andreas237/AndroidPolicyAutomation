.class public final synthetic Lcom/shopkick/app/permissions/-$$Lambda$PermissionsRequestController$2$1$6DNI2cqaa3CBIpQHKJ9PE0nOMuI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/google/android/gms/location/LocationSettingsResult;

.field private final synthetic f$1:Lcom/shopkick/app/screens/AppScreen;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/location/LocationSettingsResult;Lcom/shopkick/app/screens/AppScreen;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/permissions/-$$Lambda$PermissionsRequestController$2$1$6DNI2cqaa3CBIpQHKJ9PE0nOMuI;->f$0:Lcom/google/android/gms/location/LocationSettingsResult;

    iput-object p2, p0, Lcom/shopkick/app/permissions/-$$Lambda$PermissionsRequestController$2$1$6DNI2cqaa3CBIpQHKJ9PE0nOMuI;->f$1:Lcom/shopkick/app/screens/AppScreen;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/shopkick/app/permissions/-$$Lambda$PermissionsRequestController$2$1$6DNI2cqaa3CBIpQHKJ9PE0nOMuI;->f$0:Lcom/google/android/gms/location/LocationSettingsResult;

    iget-object v1, p0, Lcom/shopkick/app/permissions/-$$Lambda$PermissionsRequestController$2$1$6DNI2cqaa3CBIpQHKJ9PE0nOMuI;->f$1:Lcom/shopkick/app/screens/AppScreen;

    invoke-static {v0, v1}, Lcom/shopkick/app/permissions/PermissionsRequestController$2$1;->lambda$onResult$51(Lcom/google/android/gms/location/LocationSettingsResult;Lcom/shopkick/app/screens/AppScreen;)V

    return-void
.end method
