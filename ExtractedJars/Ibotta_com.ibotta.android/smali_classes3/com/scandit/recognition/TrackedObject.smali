.class public Lcom/scandit/recognition/TrackedObject;
.super Lcom/scandit/recognition/NativeHandle;
.source "TrackedObject.java"


# static fields
.field public static final TRACKED_OBJECT_TYPE_BARCODE:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_TRACKED_OBJECT_TYPE_BARCODE_get()I

    move-result v0

    sput v0, Lcom/scandit/recognition/TrackedObject;->TRACKED_OBJECT_TYPE_BARCODE:I

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/scandit/recognition/NativeHandle;-><init>(J)V

    return-void
.end method


# virtual methods
.method public getId()J
    .locals 2

    .line 27
    iget-wide v0, p0, Lcom/scandit/recognition/TrackedObject;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_tracked_object_get_id(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getLocation()Lcom/scandit/recognition/Quadrilateral;
    .locals 5

    .line 31
    iget-wide v0, p0, Lcom/scandit/recognition/TrackedObject;->mNative:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 32
    new-instance v0, Lcom/scandit/recognition/Quadrilateral;

    invoke-direct {v0}, Lcom/scandit/recognition/Quadrilateral;-><init>()V

    return-object v0

    .line 34
    :cond_0
    iget-wide v0, p0, Lcom/scandit/recognition/TrackedObject;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_tracked_object_get_location(J)J

    move-result-wide v0

    .line 35
    new-instance v2, Lcom/scandit/recognition/Quadrilateral;

    invoke-direct {v2, v0, v1}, Lcom/scandit/recognition/Quadrilateral;-><init>(J)V

    .line 36
    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->delete_ScQuadrilateral(J)V

    return-object v2
.end method

.method public getType()I
    .locals 2

    .line 23
    iget-wide v0, p0, Lcom/scandit/recognition/TrackedObject;->mNative:J

    invoke-static {v0, v1}, Lcom/scandit/recognition/Native;->sc_tracked_object_get_type(J)I

    move-result v0

    return v0
.end method

.method protected release(J)V
    .locals 0

    return-void
.end method
