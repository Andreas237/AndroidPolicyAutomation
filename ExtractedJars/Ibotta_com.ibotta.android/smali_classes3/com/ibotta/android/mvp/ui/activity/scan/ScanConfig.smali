.class public Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;
.super Ljava/lang/Object;
.source "ScanConfig.java"


# static fields
.field private static final DEFAULT_CODE_CACHE_DURATION:Ljava/lang/Long;

.field private static final DEFAULT_CODE_DUPLICATE_FILTER:Ljava/lang/Long;

.field private static final DEFAULT_MAX_NUMBER_CODES_PER_FRAME:I = 0x1


# instance fields
.field private activeSymbolCountsMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/android/barcode/ScanType;",
            "[S>;"
        }
    .end annotation
.end field

.field private backCamera:Z

.field private beepEnabled:Z

.field private codeCachingDuration:I

.field private codeDuplicateFilter:I

.field private drawLogo:Z

.field private drawViewfinder:Z

.field private maxNumberOfCodesPerFrame:I

.field private scanTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/android/barcode/ScanType;",
            ">;"
        }
    .end annotation
.end field

.field private torchEnabled:Z

.field private vibrateEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 17
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->DEFAULT_CODE_CACHE_DURATION:Ljava/lang/Long;

    .line 18
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->DEFAULT_CODE_DUPLICATE_FILTER:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->scanTypes:Ljava/util/Set;

    .line 26
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->activeSymbolCountsMap:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public addScanType(Lcom/ibotta/android/barcode/ScanType;)V
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->scanTypes:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public applyTo(Lcom/scandit/barcodepicker/ScanOverlay;)V
    .locals 2

    .line 141
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->torchEnabled:Z

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/ScanOverlay;->setTorchEnabled(Z)V

    .line 142
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->drawViewfinder:Z

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/ScanOverlay;->drawViewfinder(Z)V

    .line 143
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->beepEnabled:Z

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/ScanOverlay;->setBeepEnabled(Z)V

    .line 144
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->vibrateEnabled:Z

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/ScanOverlay;->setVibrateEnabled(Z)V

    const-string v0, "drawLogo"

    .line 145
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->drawLogo:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/scandit/barcodepicker/ScanOverlay;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public getActiveSymbolCounts(Lcom/ibotta/android/barcode/ScanType;)[S
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->activeSymbolCountsMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [S

    return-object p1
.end method

.method public getCodeCachingDuration()I
    .locals 1

    .line 42
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->codeCachingDuration:I

    return v0
.end method

.method public getCodeDuplicateFilter()I
    .locals 1

    .line 50
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->codeDuplicateFilter:I

    return v0
.end method

.method public getMaxNumberOfCodesPerFrame()I
    .locals 1

    .line 58
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->maxNumberOfCodesPerFrame:I

    return v0
.end method

.method public getScanTypes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/barcode/ScanType;",
            ">;"
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->scanTypes:Ljava/util/Set;

    return-object v0
.end method

.method public initWithDefaults()V
    .locals 2

    const/4 v0, 0x1

    .line 129
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->setBackCamera(Z)V

    .line 130
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->DEFAULT_CODE_CACHE_DURATION:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->setCodeCachingDuration(I)V

    .line 131
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->DEFAULT_CODE_DUPLICATE_FILTER:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->setCodeDuplicateFilter(I)V

    .line 132
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->setMaxNumberOfCodesPerFrame(I)V

    const/4 v0, 0x0

    .line 133
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->setTorchEnabled(Z)V

    .line 134
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->setDrawViewfinder(Z)V

    .line 135
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->setBeepEnabled(Z)V

    .line 136
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->setVibrateEnabled(Z)V

    .line 137
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->setDrawLogo(Z)V

    return-void
.end method

.method public isBackCamera()Z
    .locals 1

    .line 34
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->backCamera:Z

    return v0
.end method

.method public isBeepEnabled()Z
    .locals 1

    .line 105
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->beepEnabled:Z

    return v0
.end method

.method public isDrawLogo()Z
    .locals 1

    .line 121
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->drawLogo:Z

    return v0
.end method

.method public isDrawViewfinder()Z
    .locals 1

    .line 97
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->drawViewfinder:Z

    return v0
.end method

.method public isTorchEnabled()Z
    .locals 1

    .line 89
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->torchEnabled:Z

    return v0
.end method

.method public isVibrateEnabled()Z
    .locals 1

    .line 113
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->vibrateEnabled:Z

    return v0
.end method

.method public removeActiveSymbolCounts(Lcom/ibotta/android/barcode/ScanType;)V
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->activeSymbolCountsMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setActiveSymbolCounts(Lcom/ibotta/android/barcode/ScanType;[S)V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->activeSymbolCountsMap:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setBackCamera(Z)V
    .locals 0

    .line 38
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->backCamera:Z

    return-void
.end method

.method public setBeepEnabled(Z)V
    .locals 0

    .line 109
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->beepEnabled:Z

    return-void
.end method

.method public setCodeCachingDuration(I)V
    .locals 0

    .line 46
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->codeCachingDuration:I

    return-void
.end method

.method public setCodeDuplicateFilter(I)V
    .locals 0

    .line 54
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->codeDuplicateFilter:I

    return-void
.end method

.method public setDrawLogo(Z)V
    .locals 0

    .line 125
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->drawLogo:Z

    return-void
.end method

.method public setDrawViewfinder(Z)V
    .locals 0

    .line 101
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->drawViewfinder:Z

    return-void
.end method

.method public setMaxNumberOfCodesPerFrame(I)V
    .locals 0

    .line 62
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->maxNumberOfCodesPerFrame:I

    return-void
.end method

.method public setScanTypes(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/barcode/ScanType;",
            ">;)V"
        }
    .end annotation

    .line 69
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->scanTypes:Ljava/util/Set;

    return-void
.end method

.method public setTorchEnabled(Z)V
    .locals 0

    .line 93
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->torchEnabled:Z

    return-void
.end method

.method public setVibrateEnabled(Z)V
    .locals 0

    .line 117
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->vibrateEnabled:Z

    return-void
.end method
